package com.hotelManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelManagement.model.Employee;
import com.hotelManagement.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> saveEmployees(List<Employee> employee) {
		return employeeRepository.saveAll(employee);
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = employeeRepository.findById(employee.getEmpId()).orElse(null);
		existingEmployee.setEmpName(employee.getEmpName());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setMobNo(employee.getMobNo());
		return employeeRepository.save(existingEmployee);

	}
	


}
