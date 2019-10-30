package by.flex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class MainPageController {

    @RequestMapping(method = RequestMethod.GET)
    public String greeting() {
        return "welcome";
    }

}
