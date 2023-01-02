package com.example.EmployeeApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeApplication.model.StudentInformation;

@RestController

public class StudentController {
	
@GetMapping(path="/getStudentrecord",produces="application/json")	
    public StudentInformation getStudentInformation() {
	
		System.out.println("get student record.......");
		
		
		StudentInformation student = new StudentInformation();
		student.setStudentRollNO(14391);
		student.setName("raj");
		student.setStream("computers");
		student.setAddress("kerala");
		  
		System.out.println("student name is ::"+student.getName());
		
		return student;
}

	
@PostMapping("/saveinformation")

public Object saveStudentInformation(@RequestBody StudentInformation student) {
	


  System.out.println("student information....");
  
  System.out.println("student Rollno::"+ student.getStudentRollNO());
  
  System.out.println("student Name::"+ student.getName());
  System.out.println("student Stream::"+ student.getStream());
  System.out.println("student Address::"+ student.getAddress());
   
  return "student Information successfully added.....";
}
  
  

	
}
 