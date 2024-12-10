package com.exammm;

public class Student extends Person {
	public int studentId;

	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	public String getDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
	}

	

	
	

	
	

}
