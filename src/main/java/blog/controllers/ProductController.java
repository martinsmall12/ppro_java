package blog.controllers;


import blog.forms.ProductForm;
import blog.models.Product;
import blog.services.NotificationService;
import blog.services.ProductService;
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
public class ProductController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ProductService productService;



    @RequestMapping("/products")
    public String showProductForm(ProductForm productForm, Model model, HttpSession session) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        if (session.getAttribute("name") == null) {
            return "redirect:/users/login";
        } else {
            return "products/index";
        }

    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String showProductForm(@Valid ProductForm productForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage(
                    "Chyba!");
            return "products/index";
        }

        productService.create(new Product(productForm.getName(),productForm.getShortDescription(), productForm.getLongDescription(), productForm.getPrice()));

        notificationService.addInfoMessage("Kontrola vytvořena!");
        return "redirect:/";
    }
}
