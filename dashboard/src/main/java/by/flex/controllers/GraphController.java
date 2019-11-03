package by.flex.controllers;

import by.flex.services.servicesd.*;
import by.flex.service.GraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("graphs")
public class GraphController {

    @Autowired
    DispenserServiceDashboard dispenserServiceDashboard;

    @Autowired
    FilterServiceDashboard filterServiceDashboard;

    @Autowired
    FlowerServiceDashboard flowerServiceDashboard;

    @Autowired
    HeaterServiceDashboard heaterServiceDashboard;

    @Autowired
    LampServiceDashboard lampServiceDashboard;

    @Autowired
    PumpServiceDashboard pumpServiceDashboard;

    @Autowired
    GraphService graphService;


    @RequestMapping()
    public String graphRender(@RequestParam(name = "chart",required = false) String chart,
                              @RequestParam(name = "num",required = false,defaultValue = "10") Integer num,Model model){
        Integer count;
        if(num > 1){
            count = num;
        } else {
            count=10;
        }
        if("dispenser".equals(chart)){
            model.addAttribute("values", graphService.dataString(
                    graphService.dispenserDataList(
                            dispenserServiceDashboard.getEntity(count))
            ));
        } else if("filter".equals(chart)) {
            model.addAttribute("values", graphService.dataString(
                    graphService.filterDataList(
                            filterServiceDashboard.getEntity(count))
            ));
        } else if("flower".equals(chart)) {
            model.addAttribute("values", graphService.dataString(
                    graphService.flowerDataList(
                            flowerServiceDashboard.getEntity(count))
            ));
        } else if("heater".equals(chart)) {
            model.addAttribute("values", graphService.dataString(
                    graphService.heaterDataList(
                            heaterServiceDashboard.getEntity(count))
            ));
        } else if("lamp".equals(chart)) {
            model.addAttribute("values", graphService.dataString(
                    graphService.lampDataList(
                            lampServiceDashboard.getEntity(count))
            ));
        } else if("pump".equals(chart)) {
            model.addAttribute("values", graphService.dataString(
                    graphService.pumpDataList(
                            pumpServiceDashboard.getEntity(count))
            ));
        }
        return "graphs";
    }
}
