package com.example.EmployeeApplication.controller;

import java.util.List;
import java.util.Optional;

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
		Optional<Employee> optionlaData=null;
		Employee employee=null;
		try {
		optionlaData=employeeRepository.findById(id);
		employee=optionlaData.get();
		}catch (Exception e) {
			System.err.println("Exception Occured :: "+e.getMessage());
		} 
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
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		
		List<Employee> employeeList=employeeRepository.findAll();
		
		return employeeList;
	}
	
}