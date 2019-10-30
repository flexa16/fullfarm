package by.flex.controllers;

import by.flex.repo.DispenserRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/devices-list")
public class DevicesListController {

    @Autowired
    DispenserRepositoryDto dispenserRepositoryDto;

    @RequestMapping(method = RequestMethod.GET)
    public String devicesList() {
        System.out.println(dispenserRepositoryDto.findAll());
        return "devices-list";
    }

}
