package com.jspiders.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.studentmanagementsystem.pojo.StudentPOJO;

public interface StudentRepository extends JpaRepository<StudentPOJO, Integer>{
	
	StudentPOJO findByName(String name);
	
	StudentPOJO findByAddress(String address);

}
