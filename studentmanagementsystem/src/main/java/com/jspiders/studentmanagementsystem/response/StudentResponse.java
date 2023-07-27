package com.jspiders.studentmanagementsystem.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspiders.studentmanagementsystem.pojo.StudentPOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentResponse {
	
	public StudentResponse(String string, StudentPOJO student, Object object) {
		// TODO Auto-generated constructor stub
	}
	private String msg;
	private StudentPOJO data;
	private List<StudentPOJO> list;

}
