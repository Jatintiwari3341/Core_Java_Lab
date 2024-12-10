package com.task18;

public class Student {
	private String name;
	private int id;
	private  String Course;
	private double Fee;
	private char Grade;
	private double Average;
	public Student(String name, int id, String course, double fee, double average) {
		super();
		this.name = name;
		this.id = id;
		this.Course = course;
		this.Fee = fee;
		this.Average = average;
	}
	
	public Student(Student stud) {
		this.name=stud.name;
		this.id=stud.id;
		this.Course=stud.Course;
		this.Fee=stud.Fee;
		this.Average=stud.Average;
		
		
	}
	
	public char calculateGrade() {
		if(this.Average<0 || this.Average>100) {
			System.err.println("Error:Average markn mustv be between 0 and 100");
			System.exit(0);
			return 'X';
		}
	
	else  if(this.Average>=90 && this.Average<100) {
			System.out.println("Grade for average " +this.Average + " A ");
			return 'A';
		}
		else if(this.Average>=80 && this.Average<90) {
			System.out.println("Grade for average " +this.Average +" B ");
			return 'B';	
		}
		else if(this.Average>=70 && this.Average<80) {
			System.out.println("Grade for average " +this.Average +" C ");
			return 'C';
		}
		else if(this.Average>=60 && this.Average<70) {
			System.out.println("Grade for average " +this.Average +" D ");
			return 'D';
		}
		else if(this.Average<60){
			
			System.out.println("Grade for average " +this.Average +" F ");
			return 'F';
		}
		else {
			return 'X';
		}
	}

}
