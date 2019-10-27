package by.flex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {

    @RequestMapping("/welcome")
    public ModelAndView greeting() {
        ModelAndView model = new ModelAndView("welcome");
        return model;
    }

}
