package com.yuvas.CustomerManagement.Service;

import java.util.List;

import com.yuvas.CustomerManagement.Entity.Customer;



public interface CustomerService {
	 List<Customer> getAllCustomer(); 
	
	
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(int id);
	
	Customer updateCustomer (Customer customer);
	
	void deleteCustomerById(int id);



	
	

}
