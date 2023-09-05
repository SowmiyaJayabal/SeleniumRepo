package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentname() {
		System.out.println("Sowmiya");
	}
	public void studentdepartment() {
		System.out.println("computer science");
	}
	public void studentid() {
		System.out.println("2393838");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.collegecode();
		s.collegename();
		s.collegeRank();
		s.departmentname();
		s.studentdepartment();
		s.studentid();
		s.studentname();
	}
}
