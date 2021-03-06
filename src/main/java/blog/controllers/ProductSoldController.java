package blog.controllers;


import blog.forms.ProductSoldForm;
import blog.models.Customer;
import blog.models.Product;
import blog.models.ProductSold;
import blog.services.CustomerService;
import blog.services.NotificationService;
import blog.services.ProductService;
import blog.services.ProductSoldService;
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
public class ProductSoldController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ProductSoldService productSoldService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;


    @RequestMapping("/productSold")
    public String showProductSoldForm(ProductSoldForm productSoldForm, Model model, HttpSession session) {

        List<Product> products = productService.findAll();
        model.addAttribute("productsatr", products);

        List<Customer> customers = customerService.findAll();
        model.addAttribute("customersatr", customers);

        List<ProductSold> productsSold = productSoldService.findAll();
        model.addAttribute("productsSold", productsSold);

        if (session.getAttribute("name") == null) {
            return "redirect:/users/login";
        } else {
            return "productSold/index";
        }


    }

    @RequestMapping(value = "/productSold", method = RequestMethod.POST)
    public String showProductSoldForm(@Valid ProductSoldForm productSoldForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "productSold/index";
        }

        //Long id =  productService.findById() bindingResult.getTarget();

        Product product = productService.findById(productSoldForm.getProducts().get(0).getId());
        Customer customer =  customerService.findById(productSoldForm.getCustomers().get(0).getId());

        productSoldService.create(
                new ProductSold(productSoldForm.getSerialNumber(),
                                productSoldForm.getDateOfSale(),
                                productSoldForm.getCustomers().get(0),
                                productSoldForm.getProducts().get(0)));


        notificationService.addInfoMessage("Prodaný produkt vytvořen!");
        return "productSold/index";
    }
}
