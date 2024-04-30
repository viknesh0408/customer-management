package com.yuvas.CustomerManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.yuvas.CustomerManagement.Entity.Customer;
import com.yuvas.CustomerManagement.Service.CustomerService;



@Controller
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	
	@GetMapping("/customers")
	public String listCustomers(Model model)
	{
	  model.addAttribute("customers", customerService.getAllCustomer());	
	  return "/customers";
	}
	
	@GetMapping("/customers/new")
	public String createCustomerForm(Model model) {
		
	
		Customer customer=new Customer();
		model.addAttribute("customer", customer);
		return "create_customer";
	}
	
	@PostMapping("/customers")
	public String saveCustomers(@ModelAttribute("customer") Customer customer)
	{
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/customers/edit/{id}")
	public String editCustomerForm(@PathVariable int id, Model model) {
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "edit_customer";
	}
	
	
	@PostMapping("/customers/{id}")
	public String updateCustomer(@PathVariable int id,
			@ModelAttribute("customer") Customer customer,
			Model model) {
		
		
		Customer existingCustomer = customerService.getCustomerById(id);
		existingCustomer.setId(id);
		existingCustomer.setName(customer.getName());
		existingCustomer.setPatta_Number(customer.getPatta_Number());
		existingCustomer.setSurvey_Number(customer.getSurvey_Number());
		existingCustomer.setPhone_Number(customer.getPhone_Number());
		existingCustomer.setAddress(customer.getAddress());
		
		
		customerService.updateCustomer(existingCustomer);
		return "redirect:/customers";		
	}
	
	
	@GetMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomerById(id);
		return "redirect:/customers";
	}
	
	
	//------------------- search attempt ---------------------------//
	

	
}
