package com.gettersetter;

public class Student {
	private int studentId;
	private String name;
	
	public void setDetails(int studentId,String name) {
		this.studentId=studentId;
		this.name=name;
	}
	public int  getstudentId() {
	return studentId;
	}
	public String getname() {
		return name;
		
	}
	
	public void display() {
		System.out.println("the student id is "+getstudentId());
		System.out.println("the student name is  "+getname());
	}
//	public Student(int studentId, String name) {
//		super();
//		this.studentId = studentId;
//		this.name = name;
//	}
//	public int getStudentId() {
//		return studentId;
//	}
//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	
	

}
