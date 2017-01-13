package blog.services;

import blog.models.Check;
import blog.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MarMaly on 26.12.2016.
 */
@Service
public class CheckServiceImpl implements CheckService {


	@Autowired
	private CheckRepository checkRepository;

	@Override
	public List<Check> findAll() {
		return checkRepository.findAll();
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
