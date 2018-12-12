'use strict';

$(document).ready(function(){

    // Chart Data
    var barChartData = [
        {
            label: 'Me',
            data: [[1,4.13]],
            color: '#32c787',
            bars: {
                order: 0
            }
        },
        {
            label: 'Department',
            data: [[1,3.92]],
            color: '#d066e2',
            bars: {
                order: 1
            }
        },
        {
            label: 'University',
            data: [[1,3.67]],
            color: '#03A9F4',
            bars: {
                order: 2
            }
        }
    ];

    // Chart Options
    var barChartOptions = {
        series: {
            bars: {
                show: true,
                barWidth: 0.1,
                fill: 0.7
            }
        },
        grid : {
            borderWidth: 1,
            borderColor: '#f8f8f8',
            show : true,
            hoverable : true,
            clickable : true
        },
        yaxis: {
            tickColor: '#f8f8f8',
            tickDecimals: 0,
            font :{
                lineHeight: 13,
                style: "normal",
                color: "#9f9f9f",
            },
            shadowSize: 0
        },
        xaxis: {
            tickColor: '#fff',
            tickDecimals: 0,
            font :{
                lineHeight: 13,
                style: "normal",
                color: "#fff"
            },
            shadowSize: 0,
        },
        legend:{
            container: '.flot-chart-legends--bar',
            backgroundOpacity: 0.5,
            noColumns: 0,
            backgroundColor: '#fff',
            lineWidth: 0,
            labelBoxBorderColor: '#fff'
        }
    };

    // Create chart
    if ($('.flot-bar')[0]) {
        $.plot($('.flot-bar'), barChartData, barChartOptions);
    }
});
