package blog.controllers;


import blog.forms.CheckHistoryForm;
import blog.forms.ContOnProdSoldForm;
import blog.forms.ProductSoldForm;
import blog.models.*;
import blog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ContOnProdSoldController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ProductSoldService productSoldService;

    @Autowired
    private CheckHistoryService checkHistoryService;

    @Autowired
    private CheckService checkService;

    @Autowired
    private ContOnProdSoldService contOnProdSoldService;



    @RequestMapping("/contOnProdSold")
    public String showContOnProdSoldForm(ContOnProdSoldForm contOnProdSoldForm, Model model, HttpSession session) {

        List<Check> checks = checkService.findAll();
        model.addAttribute("checksatr", checks);

        List<ProductSold> productSolds = productSoldService.findAll();
        model.addAttribute("productSoldsatr", productSolds);

        List<CheckHistory> checkHistories = checkHistoryService.findAll();
        model.addAttribute("checkHistoriesatr", checkHistories);

        List<ContOnProdSold> contOnProdSolds = contOnProdSoldService.findAll();
        model.addAttribute("contOnProdSolds", contOnProdSolds);

        if (session.getAttribute("name") == null) {
            return "redirect:/users/login";
        } else {
            return "contOnProdSold/index";
        }

    }

    @RequestMapping(value = "/contOnProdSold", method = RequestMethod.POST)
    public String showContOnProdSoldForm(@Valid ContOnProdSoldForm contOnProdSoldForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "contOnProdSold/index";
        }

        //Long id =  productService.findById() bindingResult.getTarget();

        contOnProdSoldService.create(new ContOnProdSold(
                contOnProdSoldForm.getChecks().get(0),
                contOnProdSoldForm.getCheckHistories().get(0),
                contOnProdSoldForm.getProductSolds().get(0)
                )
        );

        notificationService.addInfoMessage("Kontroly k prodanému produktu vytvořeny!");
        return "redirect:/";
    }
}
