package blog.services;

import blog.models.Check;
import blog.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by MarMaly on 26.12.2016.
 */
public class CheckServiceImpl implements CheckService {


	@Autowired
	private CheckRepository checkRepository;

	@Override
	public List<Check> findAll() {
		return null;
	}

	@Override
	public Check findById(Long id) {
		return null;
	}

	@Override
	public Check create(Check check) {
		return checkRepository.save(check);
	}

	@Override
	public Check edit(Check check) {
		return null;
	}

	@Override
	public void deleteById(Long id) {

	}
}
