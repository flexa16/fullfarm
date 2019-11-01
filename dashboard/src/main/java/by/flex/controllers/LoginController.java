package by.flex.controllers;

import by.flex.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    UserUtils utils;

    @RequestMapping(method = RequestMethod.POST)
    public String login(@RequestParam(name = "email") String email,
                        @RequestParam(name = "password") String password) {

        System.out.println("POST Login");
        System.out.println(utils.validateUser(email, password));
        return "login";
    }

   @RequestMapping(method = RequestMethod.GET)
   public String login(){
       System.out.println("GET login");
       return "login";
   }



}
