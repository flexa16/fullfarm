package by.flex.controllers;

import by.flex.services.servicesd.DispenserServiceDashboard;
import by.flex.utils.GraphUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("graphs")
public class GraphController {

    @Autowired
    DispenserServiceDashboard service;

    @Autowired
    GraphUtils graphUtils;


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
            model.addAttribute("values",graphUtils.dispenserDataString(
                    graphUtils.dispenserDataList(
                            service.getEntity(count))
            ));
        }
        return "graphs";
    }
}
