var baseUrl = "http://18.234.210.117/evaluation/question-form/"
var jobs = {
    "data" : []
};

$(document).ready(function() {
    $("#course").select2({
        width : "100%",
        dropdownCssClass : "custom-dropdown"
    });

    $("#duration").select2({
        width : "100%",
        dropdownCssClass : "custom-dropdown"
    });

    $.fn.dataTable.moment('M/D, h:mm a');
    var jobTable = $('#job-table').DataTable({
        ajax : {
            "url" : "evaluation/list"
        },
        data : jobs.data,
        columnDefs : [ {
            "targets" : [ 0, 4
            ],
            "searchable" : false,
            "visible" : false
        },
        ],
        order : [ [ 2, "desc"
        ]
        ],
        pagingType : "full_numbers",
        pageLength : 10,
        columns : [ {
            data : 'id'
        }, {
            data : null,
            render : function(data) {
                return data.subject + ' ' + data.number;
            }
        }, {
            data : null,
            render : function(data) {
                return localeDateString(data.startTime)
            }
        }, {
            data : null,
            render : function(data) {
                return data.duration;
                // if (data.duration > 0) {
                // return data.duration + " Hours";
                // } else {
                // return "Indefinite";
                // }
            }
        }, {
            data : null,
            render : function(data) {
                return localeDateString(data.createTime)
            }
        }, {
            data : null,
            render : function(data) {
                return '<th><button class="btn btn-info btn-sm" data-toggle="modal" data-target="#access-modal" data-url="' + data.url + '"><i class="zmdi zmdi-view-web"></i> Show</button><th>'
            }
        }
        ]
    });

    $('#job-table').on('click', 'button', function(event) {
        var url = baseUrl + event.target.dataset.url;
        var status = event.target.dataset.type;
        qrcode.makeCode(url);

        $("#qrcode").find("img").attr('style', 'width:100%');

        $('#q_href').attr('href', url);
        $('#q_href').text(url);

    });

    var qrcode = new QRCode(document.getElementById("qrcode"), {
        text : "blank",
        colorDark : "#000000",
        colorLight : "#ffffff",
        correctLevel : QRCode.CorrectLevel.H,
        width : 500,
        height : 500
    });

    function localeDateString(date) {
        var options = {
            hour12 : true,
            timeZone : "America/New_York"
        };
        return moment(new Date(date).toLocaleString('en-US', options), "M/D/yyyy h:mm:ss a").format('M/D, h:mm a');
    }

    $start = $("#start");
    $start.flatpickr({
        enableTime : true,
        dateFormat : "D m/j/Y h:i K",
        minDate : "today",
        maxDate : new Date().fp_incr(120),
        time_24hr : false
    });
    $('.flatpickr-input:visible').on('focus', function() {
        $(this).blur()
    })
    $('.flatpickr-input:visible').prop('readonly', false)

    var $createEvaluationForm = $('#create-evaluation-form');
    $createEvaluationForm.on('submit', function(ev) {
        $('#create-evaluation-button').prop('disabled', true);
        ev.preventDefault();
        if ($createEvaluationForm[0].checkValidity()) {
            var form = {
                "courseId" : $("#course").val(),
                "startTime" : new Date($("#start").val()).toISOString(),
                "duration" : $("#duration").val(),
            };
            $.ajax({
                'url' : "/evaluation/create",
                'type' : 'put',
                'data' : JSON.stringify(form),
                'contentType' : "application/json",
                'dataType' : 'json',
                'success' : function(data) {
                    jobTable.ajax.reload();
                    $("#create-evaluation-modal").modal('hide');
                    $('#create-evaluation-button').prop('disabled', false);
                },
                'error' : function() {
                    $('#create-evaluation-button').prop('disabled', false);
                }
            });
        } else {
            $createEvaluationForm.find(':submit').click();
            console.log("invalid form");
            $('#create-evaluation-button').prop('disabled', false);
        }
    });

});
