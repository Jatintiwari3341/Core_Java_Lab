package com.exammm;

public class CourseEnrollment extends Person {
 public String courseName;
 public String grade;
public CourseEnrollment(String name, int age, String courseName, String grade) {
	super(name, age);
	this.courseName = courseName;
	this.grade = grade;
}
@Override
public String toString() {
	return "CourseEnrollment [courseName=" + courseName + ", grade=" + grade + ", name=" + name + ", age=" + age + "]";
}
 
 
}
