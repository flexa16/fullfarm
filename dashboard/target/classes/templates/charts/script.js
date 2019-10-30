
window.onload = function () {

    var chart = new CanvasJS.Chart("chartContainer", {
        animationEnabled: true,
        exportEnabled: true,
        title:{
            text: "Gold Medals Won in Olympics"
        },
        axisY:{
            title: "Number of Medals"
        },
        toolTip: {
            shared: true
        },
        legend:{
            cursor:"pointer",
            itemclick: toggleDataSeries
        },
        data: [

        ]
    });

    chart.render();

    function toggleDataSeries(e) {
        if(typeof(e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
            e.dataSeries.visible = false;
        }
        else {
            e.dataSeries.visible = true;
        }
        chart.render();
    }

}