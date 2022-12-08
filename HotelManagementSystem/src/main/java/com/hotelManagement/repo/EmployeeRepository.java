package com.hotelManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelManagement.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByEmpName(String eName);

	public Employee findByEmail(String email);

}
