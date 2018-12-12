var timespan = {
    "data" : []
};

$(document).ready(

        function() {

            // var a = function() {
            // $("#collapseExample").collapse('toggle');
            // }

            var ctx = $("#myChart");
            var myChart = new Chart(ctx, {
                type : 'line',
                data : {
                    labels : [ 'Sep', 'Oct', 'Nov', 'Dec'
                    ],
                    datasets : [ {
                        label : 'Ratings by Month',
                        data : [ 3.56, 3.68, 4.01, 3.92
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)'
                        ],
                        borderWidth : 3,
                        fill : false
                    }
                    ]
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                    scales : {
                        yAxes : [ {
                            ticks : {
                                min : 0,
                                max : 5
                            }
                        }
                        ]
                    }
                }
            });

            var ctxAll = $("#allChart");
            var allChart = new Chart(ctxAll, {
                type : 'bar',
                data : {
                    labels : [ ''
                    ],
                    datasets : [ {
                        label : 'Information Science',
                        data : [ 3.59
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)'
                        ],
                        borderWidth : 3,
                        fill : false
                    }, {
                        label : 'Emergency Medicine',
                        data : [ 3.9
                        ],
                        backgroundColor : [ 'rgba(208, 102, 226, 0.2)'
                        ],
                        borderColor : [ 'rgba(208, 102, 226, 1)'
                        ],
                        borderWidth : 3,
                        fill : false
                    }, {
                        label : 'Psychology',
                        data : [ 3.80
                        ],
                        backgroundColor : [ 'rgba(33, 150, 243, 0.2)'
                        ],
                        borderColor : [ 'rgba(33, 150, 243, 1)'
                        ],
                        borderWidth : 3,
                        fill : false
                    }
                    ]
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                    scales : {
                        yAxes : [ {
                            ticks : {
                                min : 0,
                                max : 5
                            }
                        }
                        ]
                    }
                }
            });

            var c1 = $("#q1Chart");
            var myChart = new Chart(c1, {
                type : 'pie',
                data : {
                    labels : [ '10/3', '10/11', '11/5', '11/14', '11/25', '12/1', '12/6'
                    ],
                    datasets : [ {
                        data : [ 10, 20, 30
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'no outline or preview – they immediately launched into lecture', 'an outline or preview, but it did not explain the relevance of the lecture',
                            'a short preview of topics or goals that raised my interest in the lecture'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });

            var c2 = $("#q2Chart");
            var myChart = new Chart(c2, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 5, 25, 7, 18
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'did no review at all; jumped straight into new material', 'mentioned previous class material without explanation',
                            'gave of a brief explanation of concepts from the last lecture', 'gave a short review of things that came up in a few prior lectures led naturally into the lecture'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });

            var c3 = $("#q3Chart");
            var myChart = new Chart(c3, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 10, 25, 6
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'no summary or transition when moving from topic to topic', 'a summary or transition, but it was confusing or too long',
                            'a short, clear summary of each topic before moving on'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });

            var c4 = $("#q4Chart");
            var myChart = new Chart(c4, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 3, 6, 8, 11, 20, 10
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'there were no new psychology terms introduced in class today', 'new psychology terms were used but not defined', 'only a few of the new terms were defined',
                            'new terms were defined but the definitions were hard to understand', 'new terms were well defined but too many at once',
                            'all terms are well defined and came just when the concepts first applied'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });

            var c5 = $("#q5Chart");
            var myChart = new Chart(c5, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 3, 3, 5, 6
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'never connected the material to the real world', 'made several connections to real world examples, but I didn\'t understand',
                            'made understandable connections to real world examples', 'gave real world examples that helped me understand the big ideas'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });

            var c6 = $("#q6Chart");
            var myChart = new Chart(c6, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 7, 14, 11, 5
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'only today’s lecture', 'what we talked about in the last lecture', 'earlier topics in the course', 'earlier topics in the course and information from other classes'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });

            var c7 = $("#q7Chart");
            var myChart = new Chart(c7, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 6, 4, 31, 23
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'never asked us to questions to see if we understood or answered questions from students', 'checked once to see if we understood and answered students questions',
                            'asked us questions multiple times', 'used ideas from student answers to questions as part of the lecture'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c8 = $("#q8Chart");
            var myChart = new Chart(c8, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 7, 14, 11, 5, 22
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'never called on any students', 'always called on same student(s)', 'called on many different students but only near where the instructor was usually standing',
                            'called on students from around the room', 'called on students from around the room, and more than just one idea came out'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c9 = $("#q9Chart");
            var myChart = new Chart(c9, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 8, 23, 1, 5, 12, 4
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'Not Applicable – there were no examples', 'Made no sense to me', 'Assumed I knew a lot about a topic I actually don’t know',
                            'Helped me understand the big ideas of the lecture', 'Helped me understand the application to another culture/situation',
                            'Showed me that researchers sometimes impose their culture on participants'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c10 = $("#q10Chart");
            var myChart = new Chart(c10, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 18, 14, 3, 11
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'I felt like I belonged', 'I was asked questions', 'I was ignored', 'I was called on'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c11 = $("#q11Chart");
            var myChart = new Chart(c11, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 2, 5, 13, 12
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)'
                        ],
                    }
                    ],
                    labels : [ 'NA - students didn’t speak', 'made the students feel stupid', 'accepted student contributions without judgement',
                            'accepted student contributions, but also helped us understand which answers were best/right'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c12 = $("#q12Chart");
            var myChart = new Chart(c12, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 7, 6, 15, 11, 5
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'not hear what was going on', 'hear everything', 'not understand the lecturer’s words', 'not read most of the slides', 'read all of the slides'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c13 = $("#q13Chart");
            var myChart = new Chart(c13, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 15, 11, 5, 7, 6,
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'was painfully slow', 'sometimes too slow', 'just right, including time for questions', 'was not too fast or slow, but there wasn’t time for questions',
                            'was often too fast to understand'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c14 = $("#q14Chart");
            var myChart = new Chart(c14, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 3, 6, 12, 18, 20
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'we only listened', 'at one point, the lecturer asked a general question', 'there was one brief activity we were supposed to do',
                            'there multiple activities throughout the lecture, but I didn’t always participate', 'we had multiple activities to do throughout the lecture and I always participated'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c15 = $("#q15Chart");
            var myChart = new Chart(c15, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 1, 5, 12, 15, 6
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'was boring', 'used the same lecture style the whole class', 'had interesting examples', 'switched smoothly between lecture and activities',
                            'kept my attention most of the time'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c16 = $("#q16Chart");
            var myChart = new Chart(c16, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 3, 3, 3, 18, 13, 5
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'Not Applicable – there were no lecture slides', 'were hard too read', 'were confusing', 'were filled with irrelevant images', 'were easy to understand',
                            'were interesting'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c17 = $("#q17Chart");
            var myChart = new Chart(c17, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 3, 13, 31, 23
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'no interest in the content', 'some interest in one part of the lecture', 'a lot of energy and enthusiasm',
                            'a lot of energy and enthusiasm and explained why the content is exciting'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
            var c18 = $("#q18Chart");
            var myChart = new Chart(c18, {
                type : 'pie',
                data : {
                    datasets : [ {
                        data : [ 7, 6, 15, 11, 5
                        ],
                        backgroundColor : [ 'rgba(50, 199, 135, 0.2)', 'rgba(208, 102, 226, 0.2)', 'rgba(33, 150, 243, 0.2)', 'rgba(255, 199, 33, 0.2)', 'rgba(255, 107, 104, 0.2)',
                                'rgba(121, 85, 72, 0.2)'
                        ],
                        borderColor : [ 'rgba(50, 199, 135, 1)', 'rgba(208, 102, 226, 1)', 'rgba(33, 150, 243, 1)', 'rgba(255, 199, 33, 1)', 'rgba(255, 107, 104, 1)', 'rgba(121, 85, 72, 1)'
                        ],
                    }
                    ],
                    labels : [ 'no one', 'the same 1 or 2 students', 'students near the front', 'students in multiple parts of the room',
                            'students everywhere in the room, and also walked around the room'
                    ],
                },
                options : {
                    events : [ "mousemove", "mouseout", "touchstart", "touchmove", "touchend"
                    ],
                }
            });
        });
