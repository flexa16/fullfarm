package by.flex.controllers;

import by.flex.services.servicesd.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/devices-list")
public class DevicesListController {

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

    @RequestMapping(method = RequestMethod.GET)
    public String devicesList(Model model) {
        model.addAttribute("dispenser",dispenserServiceDashboard.getTenResults());
        model.addAttribute("filter",filterServiceDashboard.getTenResults());
        model.addAttribute("flower",flowerServiceDashboard.getTenResults());
        model.addAttribute("heater",heaterServiceDashboard.getTenResults());
        model.addAttribute("lamp",lampServiceDashboard.getTenResults());
        model.addAttribute("pump",pumpServiceDashboard.getTenResults());
        return "devices-list";
    }

}
