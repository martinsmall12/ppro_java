package blog.services;

import blog.models.Check;
import blog.models.ContOnProdSold;

import java.util.List;

/**
 * Created by marti on 04.12.2016.
 */
public interface ContOnProdSoldService {
    List<ContOnProdSold> findAll();
    ContOnProdSold findById(Long id);
    ContOnProdSold create(ContOnProdSold contOnProdSold);
    ContOnProdSold edit(ContOnProdSold contOnProdSold);
    void deleteById(Long id);
}
