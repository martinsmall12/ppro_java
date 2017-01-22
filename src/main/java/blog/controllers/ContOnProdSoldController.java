package blog.controllers;


import blog.forms.CheckHistoryForm;
import blog.forms.ProductSoldForm;
import blog.models.CheckHistory;
import blog.models.Customer;
import blog.models.Product;
import blog.models.ProductSold;
import blog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


/*
    @RequestMapping("/productSold")
    public String showProductSoldForm(ProductSoldForm productSoldForm, Model model) {

        productSoldForm.setProducts(productService.findAll());

        List<Product> products = productService.findAll();
        model.addAttribute("productsatr", products);

        List<Customer> customers = customerService.findAll();
        model.addAttribute("customersatr", customers);

        List<ProductSold> productsSold = productSoldService.findAll();
        model.addAttribute("productsSold", productsSold);

        return "productSold/index";
    }

    @RequestMapping(value = "/productSold", method = RequestMethod.POST)
    public String showProductSoldForm(@Valid CheckHistoryForm checkHistoryForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "productSold/index";
        }

        //Long id =  productService.findById() bindingResult.getTarget();

        checkHistoryService.create(new CheckHistory(
                checkHistoryForm.getStatus(),
                checkHistoryForm.getSent(),
                checkHistoryForm.getRemark(),
                checkHistoryForm.getDateOfSent(),
                checkHistoryForm.getDateOfImpl()
        ));

        notificationService.addInfoMessage("Prodaný produkt vytvořen!");
        return "redirect:/";
    }*/
}
