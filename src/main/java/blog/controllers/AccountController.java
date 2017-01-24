package blog.controllers;

import blog.forms.LoginForm;
import blog.services.LoginService;
import blog.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Objects;

@Controller
public class AccountController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/users/login")
    public String showLoginForm(LoginForm loginForm) {

        return "users/login";
    }

    @RequestMapping("/users/logout")
    public String showLoginForm(HttpSession session) {
        session.setAttribute("name", null);
        session.setAttribute("loged", false);
        return "redirect:/users/login";
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String showLoginForm(@Valid LoginForm loginForm, BindingResult bindingResult, HttpSession session) {
        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Nastala chyba!");
            return "users/login";
        }

        if (! loginService.authentice(loginForm.getUsername(),
                loginForm.getPassword())) {
            notificationService.addErrorMessage("Invalid login");
            return "users/login";
        }

        session.setAttribute("loged",true);
        session.setAttribute("name", loginForm.getUsername());
        // Login successful
        notificationService.addInfoMessage("Přihlášen!");
        return "redirect:/";
    }
}
