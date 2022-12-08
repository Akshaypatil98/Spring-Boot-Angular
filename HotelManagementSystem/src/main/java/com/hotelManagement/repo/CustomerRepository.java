package com.hotelManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelManagement.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	public Customer findByAadharNo(String id);

	// public List<Customer> findAllCustomer();
//	public  void deleteById(String id);
//	public Customer save(Customer customer);

}
