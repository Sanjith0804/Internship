package com.intermediate;

import com.basic.StudentDetails;

public class AccessDifferentPackage {
	
	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
		System.out.println(student.name);
//		System.out.println(student.parentName);
//		System.out.println(student.dob);
//		System.out.println(student.cgpa); //default
	}

}
