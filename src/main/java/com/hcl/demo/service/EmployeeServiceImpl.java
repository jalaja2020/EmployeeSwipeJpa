package com.hcl.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.demo.entiy.Employee;
import com.hcl.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
		return employees; 
	}

	public Employee insertEmployeeSwipeDetails(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployeeSwipeDetailsById(int id) throws Exception {
		return employeeRepository.findById(id).orElseThrow(Exception::new);
	}
	
	
	public Employee getEmployeeSwipeDetailsByLocation(String location) throws Exception { 
		return employeeRepository.findByLocation(location).orElseThrow(Exception::new);
	}

}
