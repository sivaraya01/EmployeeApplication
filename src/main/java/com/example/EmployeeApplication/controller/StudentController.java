package com.example.EmployeeApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.config.RepositoryConfigurationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeApplication.model.StudentInformation;
import com.example.EmployeeApplication.repository.StudentInformationRepository;

@RestController

public class StudentController {
	
	@Autowired
	
	StudentInformationRepository studentInformationRepository;

	
//@GetMapping(path="/getStudentrecord",produces="application/json")	
	@GetMapping("/getStudentRecord/{id}")
    public StudentInformation getStudentInformation() {
	
		System.out.println("get student record.......");
		
	//	Student student = studentinformation
	//	StudentInformation student = new StudentInformation();
	//	student.setStudentRollNO(14391);
	//	student.setName("raj");
	//	student.setStream("computers");
	//	student.setAddress("kerala");
		  
	//	System.out.println("student name is ::"+student.getName());
		
	//	return student;
		return null;
}

	
@PostMapping("/saveinformation")

public Object saveStudentInformation(@RequestBody StudentInformation student) {
	


  System.out.println("student information....");
  
  System.out.println("student Rollno::"+ student.getStudentRollNO());
  
  System.out.println("student Name::"+ student.getName());
  System.out.println("student Stream::"+ student.getStream());
  System.out.println("student Address::"+ student.getAddress());

  //StudentInformationRepository.save (student);
  studentInformationRepository.save(student);
  return "student Information successfully added.....";
}
  
  

	
}
 