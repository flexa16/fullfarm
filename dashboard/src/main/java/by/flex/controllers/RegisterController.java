package by.flex.controllers;


import by.flex.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("register")
public class RegisterController {

    @Autowired
    UserUtils utils;

    @RequestMapping(method = RequestMethod.POST)
    public String register(@RequestParam(name = "email") String email,
                           @RequestParam(name = "password") String password) {
        utils.registerNewUser(email,password);
        return "welcome";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String register() {
        return "register";
    }

}
