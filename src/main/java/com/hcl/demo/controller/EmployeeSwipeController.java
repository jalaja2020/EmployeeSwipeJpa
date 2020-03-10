package com.hcl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demo.entiy.Employee;
import com.hcl.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeSwipeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/rest/employee/all")
	public List<Employee> getAllEmployeesSwipeDetails() {
		return employeeServiceImpl.getAllEmployees();
	}
	
	@PostMapping("/rest/employee")
	public Employee insertEmployeeDetails(@RequestBody Employee employee) {
		return employeeServiceImpl.insertEmployeeSwipeDetails(employee);
	}
	
	@GetMapping("/rest/employee/{id}")
	public Employee getEmployeeDetailsById(@PathVariable("id") int id) throws Exception {
		return employeeServiceImpl.getEmployeeSwipeDetailsById(id);
	}
	
	
	@GetMapping("/rest/employee/location/{location}") 
	public Employee getEmployeeDetailsById(@PathVariable("location") String location) throws Exception
	{ 
		return employeeServiceImpl.getEmployeeSwipeDetailsByLocation(location);

	}
	 
	
}
