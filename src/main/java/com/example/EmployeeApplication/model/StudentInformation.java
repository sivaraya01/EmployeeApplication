package com.example.EmployeeApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentInformation{
public static Object save;
@Id
  private int studentRollNO;
   private String name;
   private String stream;
   private String address;
	
  public static Object getSave() {
	return save;
}
public static void setSave(Object save) {
	StudentInformation.save = save;
}
public int getStudentRollNO() {
	return studentRollNO;
}
public void setStudentRollNO(int studentRollNO) {
	this.studentRollNO = studentRollNO;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
	


	


