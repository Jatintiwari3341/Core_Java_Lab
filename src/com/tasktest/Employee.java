package com.tasktest;
import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public Employee getEmployeeObject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.nextLine();
		 name=sc.nextLine();
			System.out.println("enter salary");
			double sal=sc.nextDouble();
			return new Employee(id,name,sal);
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	

}
