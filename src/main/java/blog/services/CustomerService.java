package blog.services;

import blog.models.Customer;
import blog.models.ProductSold;

import java.util.List;

/**
 * Created by marti on 04.12.2016.
 */
public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    Customer create(Customer customer);
    Customer edit(Customer customer);
    void deleteById(Long id);
}
