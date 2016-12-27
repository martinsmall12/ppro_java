package blog.controllers;

import blog.forms.CheckForm;
import blog.forms.RegisterForm;
import blog.models.User;
import blog.services.NotificationService;
import blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CheckController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private UserService userService;



    @RequestMapping("/check")
    public String showCheckForm(CheckForm checkForm) {
        return "check/index";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String showCheckForm(@Valid CheckForm checkForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "check/index";
        }
        //userService.create(new User(registerForm.getUsername(), registerForm.getPassword(), registerForm.getFullName()));

        // Login successful
        notificationService.addInfoMessage("Kontrola vytvořena!");
        return "redirect:/";
    }
}
