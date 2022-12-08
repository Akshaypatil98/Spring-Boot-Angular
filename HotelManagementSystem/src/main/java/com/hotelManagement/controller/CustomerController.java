package com.hotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagement.Service.CustomerService;
import com.hotelManagement.model.Customer;




@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return customerService.saveCustomer(customer);
		
	}
	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		return customerService.getCustomers();
	}
	@GetMapping("/customerId/{id}")
	public Customer findCustomerById(@PathVariable String id) {
		return customerService.getCustomerById(id);
	}
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomerById(id);
	}
}
