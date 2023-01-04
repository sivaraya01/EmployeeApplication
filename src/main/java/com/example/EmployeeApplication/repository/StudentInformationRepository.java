package com.example.EmployeeApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeApplication.model.StudentInformation;

@Repository

public interface StudentInformationRepository extends JpaRepository<StudentInformation, Integer>{

}
