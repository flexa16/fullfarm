package by.flex.user;

import by.flex.list.services.UserService;
import by.flex.pojo.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    @Autowired
    UserService userService;

    @GetMapping
    public String showRegistrationForm(Model model) {
        return "registration";
    }

    @PostMapping
    public String registerForm(@ModelAttribute AppUser appUser,
                               BindingResult bindingResult) {
        userService.saveUser(appUser);
        if (userService.saveUser(appUser)) {
            return "redirect:/login";
        }
        return "error";
    }


}
