package com.example.EmployeeApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeApplication.model.Employee;
import com.example.EmployeeApplication.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeDetails(@PathVariable int id) {
		System.out.println("GET Employee Method Started....");
		
		Employee employee=employeeRepository.getById(id);
	
		return employee;
	}
	
	
	
	
	
	
	
	
	@PostMapping(path="/saveEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object saveEmployeeDetails(@RequestBody Employee employee) {
		
		System.out.println("Employee Details....!");
		System.out.println("employee Id :: "+employee.getEmployeeId());
		System.out.println("employee name::" +employee.getName());
		System.out.println("employee company ::"+employee.getCompany());
		System.out.println(employee.getLocation());
		employeeRepository.save(employee);
		return "Employee Details Saved Successfully..";
	}
	
}