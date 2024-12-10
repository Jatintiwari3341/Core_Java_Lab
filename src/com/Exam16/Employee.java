package com.Exam16;

public class Employee {
	private int employeeId;
    private String  employeeName;
    private double employeeSalary;
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

    public double calculateBounus() {
    	
    	double totalSalary=this.employeeSalary+this.employeeSalary*10/100;
    	System.out.println(totalSalary);
    	return 0.0;
    }

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
    
	
}
