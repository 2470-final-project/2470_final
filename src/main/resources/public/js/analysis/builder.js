$(document).ready(function() {
    var data = {
        "data" : []
    };

    $.fn.dataTable.moment('M/D/YYYY, h:mm:ss a');
    var table = $('#queryTable').DataTable({
        ajax : {
            "url" : "/user/users"
        },
        data : data.data,
        columnDefs : [ {
            "targets" : [ 0
            ],
            "searchable" : false
        }
        ],
        columns : [ {
            data : 'id'
        }, {
            data : 'username'
        }, {
            data : null,
            render : function(data) {
                return data.role == "ROLE_ADMIN" ? "System Administrator" : "Instructor";
            }
        }, {
            data : null,
            render : function(data) {
                return data.enabled;
            }
        }, {
            data : null,
            render : function(data) {
                return data.enabled ? "Yes" : "No";
            }
        }, {
            data : null,
            render : function(data) {
                return localeDateString(data.createTime)
            }
        }, {
            data : null,
            render : function(data) {
                return localeDateString(data.updateTime)
            }
        }, {
            data : null,
            render : function(data) {
                html = '<div class="btn-demo">';
                html += '<button class="btn btn-info btn-sm" data-toggle="modal" data-target="#edit-user-modal" data-id="' + data.id + '"><i class="zmdi zmdi-edit"></i> Edit</button>'
                html += '<button class="btn btn-warning btn-sm" data-toggle="modal" data-target="#reset-password-modal" data-id="' + data.id + '"><i class="zmdi zmdi-undo"></i> Reset Password</button>'
                if (data.enabled) {
                    html += '<button class="btn btn-light btn-sm" data-toggle="modal" data-target="#toggle-disable-modal" data-id="' + data.id + '"><i class="zmdi zmdi-block"></i> Disable</button>'
                } else {
                    html += '<button class="btn btn-light btn-sm" data-toggle="modal" data-target="#toggle-enable-modal" data-id="' + data.id + '"><i class="zmdi zmdi-arrow-right"></i> Enable</button>'
                }
                html += '</div>'
                return html
            }
        }
        ],
        order : [ [ 2, 'desc'
        ]
        ],
    });

    $("#createButton").click(function() {

        if ($('#parameter-form')[0].checkValidity()) {
            var form = {
                "alias" : $("#alias").val(),
                "period" : $("#period").val() * $("#period_unit").val(),
                "origin" : $("#origin").val() * $("#origin_unit").val(),
                "duration" : $("#duration").val() * $("#duration_unit").val()
            };
            $.ajax({
                'url' : "/analysis/query",
                'type' : 'post',
                'data' : JSON.stringify(form),
                'contentType' : "application/json",
                'dataType' : 'json',
                'success' : function(data) {
                    queries = data;
                    table.clear().draw();
                    table.rows.add(queries.data); // Add new data
                    table.columns.adjust().draw();
                },
                'error' : function() {
                }
            });
        } else {
            console.log("invalid form");
        }

    });

    function secondsToStr(seconds) {
        function numberEnding(number) {
            return (number > 1) ? 's' : '';
        }

        var temp = Math.floor(seconds);
        var years = Math.floor(temp / 31536000);
        if (years) {
            return years + ' year' + numberEnding(years);
        }
        var days = Math.floor((temp %= 31536000) / 86400);
        if (days) {
            return days + ' day' + numberEnding(days);
        }
        var hours = Math.floor((temp %= 86400) / 3600);
        if (hours) {
            return hours + ' hour' + numberEnding(hours);
        }
        var minutes = Math.floor((temp %= 3600) / 60);
        if (minutes) {
            return minutes + ' minute' + numberEnding(minutes);
        }
        var seconds = temp % 60;
        if (seconds) {
            return seconds + ' second' + numberEnding(seconds);
        }
        return 'N/A';
    }

    function estimateExecTime(dur, interval) {
        if (dur === undefined || interval === undefined)
            return 4;
        if (dur === 0 || interval === 0)
            return 4;
        var idx1 = dur / interval;
        if (idx1 < 16)
            return 0;
        else if (idx1 < 24)
            return 1;
        else if (idx1 < 32)
            return 2;
        else
            return 3;
    }

    function localeDateString(date) {
        var options = {
            hour12 : true,
            timeZone : "America/New_York"
        };
        return new Date(date).toLocaleString('en-US', options);
    }

    // $('#queryTable tbody').on('mouseover', 'tr', function() {
    // $(this).attr("style", "background-color:#ffffdd");
    // });
    //
    // $('#queryTable tbody').on('mouseout', 'tr', function() {
    // $(this).removeAttr('style');
    // ;
    // });
    //
    // $('#queryTable tbody').on('click', 'tr', function() {
    // window.location.href = '/analysis/edit/' + table.row($(this)).data().id;
    // });
});
