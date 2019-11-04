package by.flex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AccessController {

    @RequestMapping(name = "/access", method = RequestMethod.GET)
    public ModelAndView access() {
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("message", "Access denied");
        modelAndView.setViewName("access");
        return modelAndView;
    }
}
