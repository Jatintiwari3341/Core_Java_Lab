package com.task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
  
  
  for(int i=0;i<2;i++) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the student id");
	int id=sc.nextInt();
				
	System.out.println("enter the student name");
	String name=sc.nextLine();
	name=sc.nextLine();
	System.out.println("Enter the student gpa");
	double gpa=sc.nextDouble();
	Student s1=new Student(id,name,gpa);
	System.out.println(s1);
	
	
  }
  
	}

}
