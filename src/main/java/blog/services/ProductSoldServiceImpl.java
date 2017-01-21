package blog.services;

import blog.models.Check;
import blog.models.ProductSold;
import blog.repositories.CheckRepository;
import blog.repositories.ProductRepository;
import blog.repositories.ProductSoldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MarMaly on 26.12.2016.
 */
@Service
public class ProductSoldServiceImpl implements ProductSoldService {


	@Autowired
	private ProductSoldRepository productSoldRepository;


	@Override
	public List<ProductSold> findAll() {
		return productSoldRepository.findAll();
	}

	@Override
	public ProductSold findById(Long id) {
		return null;
	}

	@Override
	public ProductSold create(ProductSold productSold) {
		return productSoldRepository.save(productSold);
	}

	@Override
	public ProductSold edit(ProductSold productSold) {
		return null;
	}

	@Override
	public void deleteById(Long id) {

	}
}
