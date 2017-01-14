package blog.services;

import blog.models.Product;

import java.util.List;

/**
 * Created by marti on 04.12.2016.
 */
public interface ProductService {
    List<Product> findAll();

    Product findById(Long id);

    Product create(Product product);

    Product edit(Product product);

    void deleteById(Long id);
}
