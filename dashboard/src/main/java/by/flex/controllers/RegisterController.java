package by.flex.controllers;


import by.flex.pojo.DashUser;
import by.flex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class RegisterController {

    @Autowired
    UserService service;

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        DashUser user = new DashUser();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @RequestMapping(name = "/register", method = RequestMethod.POST)
    public ModelAndView register(@Valid DashUser user) {
        ModelAndView modelAndView =new ModelAndView();
        DashUser dashUser = service.findUserByEmail(user.getEmail());
        if (dashUser != null) {
            modelAndView.addObject("message", "User email is already exist");
        } else if("".equals(user.getPassword())){
            modelAndView.addObject("message", "Incorrect password");
        } else {
            service.registerNewUser(user);
            modelAndView.addObject("message", "User has been registered successfully");

        }
        modelAndView.addObject("user", new DashUser());
        modelAndView.setViewName("register");
       return modelAndView;
    }


}
