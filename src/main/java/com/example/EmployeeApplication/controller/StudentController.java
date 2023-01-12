package com.example.EmployeeApplication.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.config.RepositoryConfigurationUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/getStudentrecord/{id}")
	  
	public  StudentInformation  getInformation(@PathVariable int id)
	
	{
		System.out.println("get student record.......");
		Optional<StudentInformation> OptionalData=null;
		StudentInformation student=null;
		try {
     OptionalData =  studentInformationRepository.findById(id);
		}catch (Exception e) {
			System.err.println("exception occurs ::"+ e.getMessage());
		}
		
	//	Student student = studentinformation
	//	StudentInformation student = new StudentInformation();
	//	student.setStudentRollNO(14391);
	//	student.setName("raj");
	//	student.setStream("computers");
	//	student.setAddress("kerala");
		  
	//	System.out.println("student name is ::"+student.getName());
		
		return student;
}
	
@PostMapping(path ="/saveInformation", consumes= MediaType.APPLICATION_JSON_VALUE)
 
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
  
  @GetMapping("/getStudentInformation")
   public List<StudentInformation> getStudentInformation()
  {
	  
	  List<StudentInformation> studentList = studentInformationRepository.findAll();
	  
	  return studentList;
	  
  }

	
}
 