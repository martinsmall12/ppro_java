package blog.services;

import blog.models.Check;
import blog.models.ContOnProdSold;
import blog.repositories.CheckRepository;
import blog.repositories.ContOnProdSoldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MarMaly on 26.12.2016.
 */
@Service
public class ContOnProdSoldServiceImpl implements ContOnProdSoldService {


	@Autowired
	private ContOnProdSoldRepository contOnProdSoldRepository;


	@Override
	public List<ContOnProdSold> findAll() {
		return contOnProdSoldRepository.findAll();
	}

	@Override
	public ContOnProdSold findById(Long id) {
		return contOnProdSoldRepository.findOne(id);
	}

	@Override
	public ContOnProdSold create(ContOnProdSold contOnProdSold) {

		return contOnProdSoldRepository.save(contOnProdSold);

	}

	@Override
	public ContOnProdSold edit(ContOnProdSold contOnProdSold) {
		return null;
	}

	@Override
	public void deleteById(Long id) {
		contOnProdSoldRepository.delete(id);
	}
}
