package com.task;

import java.util.Scanner;

public class Student {

private int studentId;
private String studentName;
private double studentGPA;
public Student(int studentId, String studentName, double studentGPA) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentGPA = studentGPA;
}

public static Student getStudentObject()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the student id");
	int id=sc.nextInt();
				
	System.out.println("enter the student name");
	String name=sc.nextLine();
	name=sc.nextLine();
	System.out.println("Enter the student gpa");
	double gpa=sc.nextDouble();
		return new Student(id,name,gpa);
}



@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGPA=" + studentGPA + "]";
}


}
