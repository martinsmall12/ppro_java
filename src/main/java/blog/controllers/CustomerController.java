package blog.controllers;


import blog.forms.CustomerForm;
import blog.forms.ProductForm;
import blog.models.Customer;
import blog.models.Product;
import blog.services.CustomerService;
import blog.services.NotificationService;
import blog.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private CustomerService customerService;



    @RequestMapping("/customers")
    public String showCustomerForm(CustomerForm customerForm, Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);

        return "customers/index";
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public String showCustomerForm(@Valid CustomerForm customerForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "customers/index";
        }

        //productService.create(new Product(productForm.getName(),productForm.getShortDescription(), productForm.getLongDescription(), productForm.getPrice()));

        notificationService.addInfoMessage("Zákazník vytvořen!");
        return "redirect:/";
    }
}
