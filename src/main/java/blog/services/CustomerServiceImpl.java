package blog.services;

import blog.models.Check;
import blog.models.Customer;
import blog.repositories.CheckRepository;
import blog.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MarMaly on 26.12.2016.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(Long id) {
		return null;
	}

	@Override
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer edit(Customer customer) {
		return null;
	}

	@Override
	public void deleteById(Long id) {

	}
}
