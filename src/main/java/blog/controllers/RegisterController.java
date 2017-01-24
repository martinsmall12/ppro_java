package blog.controllers;

import blog.forms.LoginForm;
import blog.forms.RegisterForm;
import blog.models.User;
import blog.services.LoginService;
import blog.services.NotificationService;
import blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private UserService userService;



    @RequestMapping("/users/register")
    public String showRegisterForm(RegisterForm registerForm) {
        return "users/register";
    }

    @RequestMapping(value = "/users/register", method = RequestMethod.POST)
    public String showRegisterForm(@Valid RegisterForm registerForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "users/register";
        }
        userService.create(new User(registerForm.getUsername(), registerForm.getPassword(), registerForm.getFullName()));

        // Login successful
        notificationService.addInfoMessage("Registrace proběhla v pořádku!");
        return "redirect:/users/login";
    }
}
