package blog.forms;


import blog.models.Customer;
import blog.models.Product;
import sun.util.resources.cldr.mas.CurrencyNames_mas;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

public class ProductSoldForm {


    @Size(max = 50)
    private String serialNumber;

    private Date dateOfSale;

    private List<Product> products;

    private List<Customer> customers;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public List<Product> getProducts() { return products; }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
