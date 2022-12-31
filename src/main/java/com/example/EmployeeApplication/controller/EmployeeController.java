package com.example.EmployeeApplication.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeApplication.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/getEmployee")
	public Employee getEmployeeDetails() {
		System.out.println("GET Employee Method Started....");
		
		Employee employee=new Employee();
		employee.setEmployeeId(123);
		employee.setName("Siva");
		employee.setCompany("Virtusa");
		employee.setLocation("Bangalore");
		
		System.out.println("Employee name is :: "+employee.getName());//Employee name is :: Siva
		
		return employee;
	}
	
	@PostMapping(path="/saveEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object saveEmployeeDetails(@RequestBody Employee employee) {
		
		System.out.println("Employee Details....!");
		System.out.println("employee Id :: "+employee.getEmployeeId());
		System.out.println("employee name::" +employee.getName());
		System.out.println("employee company ::"+employee.getCompany());
		System.out.println(employee.getLocation());
		return "Employee Details Saved Successfully..";
	}
	
}