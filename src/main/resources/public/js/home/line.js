'use strict';

$(document).ready(function(){

    // Chart Data
    var lineChartData = [
        {
            label: 'Me',
            data: [[1,3.55], [2,3.62], [3,4.01], [4,3.86], [5,4.44], [6,3.40], [7,4.24]],
            color: '#32c787'
        }
    ];

    // Chart Options
    var lineChartOptions = {
        series: {
            lines: {
                show: true,
                barWidth: 0.05,
                fill: 0
            }
        },
        shadowSize: 0.1,
        grid : {
            borderWidth: 1,
            borderColor: '#edf9fc',
            show : true,
            hoverable : true,
            clickable : true
        },

        yaxis: {
            tickColor: '#edf9fc',
            tickDecimals: 0,
            font :{
                lineHeight: 13,
                style: 'normal',
                color: '#9f9f9f',
            },
            shadowSize: 0
        },

        xaxis: {
            tickColor: '#fff',
            tickDecimals: 0,
            font :{
                lineHeight: 13,
                style: 'normal',
                color: '#9f9f9f'
            },
            shadowSize: 0,
        },
        legend:{
            container: '.flot-chart-legends--line',
            backgroundOpacity: 0.5,
            noColumns: 0,
            backgroundColor: '#fff',
            lineWidth: 0,
            labelBoxBorderColor: '#fff'
        }
    };

    // Create chart
    if ($('.flot-line')[0]) {
        $.plot($('.flot-line'), lineChartData, lineChartOptions);
    }
});
