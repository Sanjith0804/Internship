package com.intermediate;

import com.basic.StudentDetails;

public class InheritedDifferentPackage extends StudentDetails {
	
	public static void main(String[] args) {
		InheritedDifferentPackage inheritedStudent = new InheritedDifferentPackage();
		System.out.println(inheritedStudent.name); //public
//		System.out.println(inheritedStudent.parentName); //private
		System.out.println(inheritedStudent.dob); //protected
//		System.out.println(inheritedStudent.cgpa); //default
		
	}

}
