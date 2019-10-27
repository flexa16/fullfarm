package by.flex.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@Controller
public class ListController {
    private static final Logger log = Logger.getLogger(ListController.class.getName());


    @RequestMapping(method = RequestMethod.GET)
    public String showDevices() {
        log.info("Calling devicesList");
        return "devicesList";
    }


}
