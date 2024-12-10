package com.taskpolythird;

public class Employee {
	private double hoursWorked;
	private double hourlyRate;
	private double annualSalary;
	private double salesAmount;
	private float commissionRate;
	//hourly emp
	public Employee(double hoursWorked, double hourlyRate) {
		super();
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	//sal emp
	public Employee(double annualSalary) {
		super();
		this.annualSalary = annualSalary;
	}

	public Employee(double salesAmount, float commissionRate) {
		super();
		this.salesAmount = salesAmount;
		this.commissionRate = commissionRate;
	}

	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}

	public double calculateSalary(double annualSalary) {
		return this.annualSalary/12;
	}
	public double calculateSalary(double salesAmount,float commissionRate) {
		return this.salesAmount*this.commissionRate;	
	}
	
}
