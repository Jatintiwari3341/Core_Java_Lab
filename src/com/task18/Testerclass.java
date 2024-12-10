package com.task18;

public class Testerclass {

	public static void main(String[] args) {
		Student s1=new Student("raj",101,"java",27000,70);
		
		Student s2=new Student(s1);
		s1.calculateGrade();s2.calculateGrade();
		
	}

}
