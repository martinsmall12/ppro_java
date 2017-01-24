package blog.controllers;

import blog.forms.CheckHistoryForm;
import blog.models.CheckHistory;
import blog.services.CheckHistoryService;
import blog.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by M.B. on 22.01.2017.
 */
@Controller
public class CheckHistoryController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private CheckHistoryService checkHistoryService;

    @RequestMapping("/checkHistory")
    public String showCheckHistoryForm(CheckHistoryForm checkHistoryForm, HttpSession session) {

        if (session.getAttribute("name") == null) {
            return "redirect:/users/login";
        } else {
            return "checkHistory/index";
        }


    }

    @RequestMapping(value = "/checkHistory", method = RequestMethod.POST)
    public String showCheckHistoryForm(@Valid CheckHistoryForm checkHistoryForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "checkHistory/index";
        }

        checkHistoryService.create(new CheckHistory(checkHistoryForm.getStatus(),
                checkHistoryForm.getSent(),
                checkHistoryForm.getRemark(),
                checkHistoryForm.getDateOfSent(),
                checkHistoryForm.getDateOfImpl()));

        notificationService.addInfoMessage("Historie kontrol přiřazena!");
        return "redirect:/";
    }
}