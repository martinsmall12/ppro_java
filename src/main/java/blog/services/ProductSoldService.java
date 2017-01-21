package blog.services;

import blog.models.Check;
import blog.models.ProductSold;

import java.util.List;

/**
 * Created by marti on 04.12.2016.
 */
public interface ProductSoldService {
    List<ProductSold> findAll();
    ProductSold findById(Long id);
    ProductSold create(ProductSold productSold);
    ProductSold edit(ProductSold productSold);
    void deleteById(Long id);
}
