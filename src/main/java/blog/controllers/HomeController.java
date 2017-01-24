package blog.controllers;

import blog.models.Post;
import blog.repositories.UserRepository;
import blog.services.NotificationService;
import blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

import static java.util.stream.Collectors.*;

@Controller
public class HomeController {

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/")
    public String home(Model model, HttpSession session) {
        if (session.getAttribute("name") == null) {
            return "redirect:/users/login";
        } else {
            return "index";
        }

    }
}