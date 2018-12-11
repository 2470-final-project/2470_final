var baseUrl = "http://18.234.210.117/evaluation/question-form/"

$(document).ready(function() {

    var jobs = {
        "data" : evaluations
    };

    $.fn.dataTable.moment('M/D, h:mm a');
    var jobTable = $('#job-table').DataTable({
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
});
