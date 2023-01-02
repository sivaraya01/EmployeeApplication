package com.example.EmployeeApplication.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeApplication.model.Department;

@RestController
public class DepartmentController {
		
		@GetMapping(path="/getDepartment")
		public Department getDepartmentDetails() 
		{
			 System.out.println("GET Department Method Started....");
			
			Department department=new Department(); 
			department.setDepartmentId(123);
			department.setName("cse");
			department.setStrength(69);
			department.setSubjects(20);
			
			System.out.println("department name is :: "+department.getName());
			
			return department;
		}
		@PostMapping(path="/saveDepartment",consumes = MediaType.APPLICATION_JSON_VALUE)
		public Object saveDeportmentDetails(@RequestBody Department department) 
		{
			
			System.out.println("Deportment Details...."); 
			System.out.println("deportment Id :: "+department.getDepartmentId());
			System.out.println("deportment name::" +department.getName());
			System.out.println("deportment company ::"+department.getStrength());
			System.out.println(department.getSubjects());
			return "deportment Details Saved Successfully..";
		}
		

}


