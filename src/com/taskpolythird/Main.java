package com.taskpolythird;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(160d,15d);
	System.out.println("Monthly salary of hourly employee "+e1.calculateSalary());
	Employee e2=new Employee(60000d);
System.out.println("Monthly salary of salarized employee "+e2.calculateSalary(0));
Employee e3=new Employee(50000d,0.10f);
System.out.println("The commission of the employee is "+e3.calculateSalary(0, 0));
	}

}
