package com.example.EmployeeApplication.model;

public class Department {
	private int DepartmentId;
	private String name;
	private int Strength;
	private int Subjects;
	public int getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return Strength;
	}
	public void setStrength(int strength) {
		Strength = strength;
	}
	public int getSubjects() {
		return Subjects;
	}
	public void setSubjects(int subjects) {
		Subjects = subjects;
	}
	

	

}
