$(document).ready(
        function() {
            function notify(msg) {
                $.notify({
                    icon : "glyphicon glyphicon-warning-sign",
                    title : '',
                    message : msg,
                    url : ''
                }, {
                    element : 'body',
                    type : "danger",
                    allow_dismiss : false,
                    placement : {
                        from : "top",
                        align : "center"
                    },
                    offset : {
                        x : 20,
                        y : 20
                    },
                    spacing : 10,
                    z_index : 1000000000,
                    delay : 2000,
                    timer : 1000,
                    url_target : '_blank',
                    mouse_over : false,
                    animate : {
                        enter : "animated fadeInUp",
                        exit : "animated fadeOutDown"
                    },
                    template : '<div data-notify="container" class="alert alert-dismissible alert-{0} alert--notify" role="alert">' + '<span data-notify="icon"></span> '
                            + '<span data-notify="title">{1}</span> ' + '<span data-notify="message">{2}</span>' + '<div class="progress" data-notify="progressbar">'
                            + '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' + '</div>'
                            + '<a href="{3}" target="{4}" data-notify="url"></a>' + '<button type="button" aria-hidden="true" data-notify="dismiss" class="alert--notify__close">Close</button>'
                            + '</div>'
                });
            }

            function getCheckedBoxes() {
                var checkboxes = $(".rc");
                var checkboxesChecked = [];
                for (var i = 0; i < checkboxes.length; i++) {
                    if (checkboxes[i].checked) {
                        checkboxesChecked.push(checkboxes[i]);
                    }
                }
                return checkboxesChecked.length > 0 ? checkboxesChecked : null;
            }

            var $form = $('#evaluation-form');
            $form.on('submit', function(ev) {

                ev.preventDefault();

                var validate = true;
                var unanswered = new Array();
                var answered = new Array();

                $('.question').each(function(i) {
                    var question = $(this).prev().text();
                    if (!$(this).find('input').is(':checked')) {
                        unanswered.push(i + 1);
                        this.style.color = 'red';
                        validate = false;
                    } else {
                    }
                });

                if (unanswered.length > 0) {
                    msg = "Please answer the following question(s): " + unanswered.join(', ') + '.';
                    notify(msg);
                    return validate;
                }
                
                var checkedBoxes = getCheckedBoxes();

                var answers = [];
                $.each(checkedBoxes, function(index, value) {
                    var idString = $(value).attr('id');
                    var qAndA = idString.split("option");

                    var answer = {
                        optionNumber : qAndA[1],
                        questionId : qAndA[0]
                    };
                    answers.push(answer);
                });

                var form = {
                    "url" : $("#url").text(),
                    "answers" : answers
                };
                $.ajax({
                    'url' : "/evaluation/submit",
                    'type' : 'post',
                    'data' : JSON.stringify(form),
                    'contentType' : "application/json",
                    'dataType' : 'json',
                    'success' : function(data) {
                        window.location.replace("/thanks.html");
                    },
                    'error' : function() {
                    }
                });
            });

            $(':radio,:checkbox').on('change', function(ev) {
                $(event.target).parent().parent(".question").removeAttr("style");
            });
        });
