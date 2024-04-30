package com.yuvas.CustomerManagement.Service;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.yuvas.CustomerManagement.Entity.*;
import com.yuvas.CustomerManagement.Repo.*;

@Service
public class CustomerServiceImpl implements CustomerService{
private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}


	@Override
	public Customer saveCustomer(Customer customer) {
		try {
			return customerRepository.save(customer);
		}catch (DataIntegrityViolationException e) {
            throw new DuplicateDataException("Duplicate data found");
        }
	}


	@Override
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}


	@Override
	public void deleteCustomerById(int id) {
		customerRepository.deleteById(id);
	}

	

}
