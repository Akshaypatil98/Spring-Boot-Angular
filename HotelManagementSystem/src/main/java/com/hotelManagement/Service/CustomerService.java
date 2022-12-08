package com.hotelManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelManagement.model.Customer;

import com.hotelManagement.repo.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {

		return customerRepository.save(customer);
	}

	
	public Customer getCustomerById(String id) {
		return customerRepository.findByAadharNo(id);
	}

	public List<Customer> getCustomers() {

		return customerRepository.findAll();

	}

	public void deleteCustomerById(String id) {
		customerRepository.deleteById(id);
	}

	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer = customerRepository.findByAadharNo(customer.getAadharNo());
		existingCustomer.setName(customer.getName());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setMobNo(customer.getMobNo());
		existingCustomer.setRoom(customer.getRoom());
		return customerRepository.save(existingCustomer);

	}

}
