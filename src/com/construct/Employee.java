package com.construct;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	
	public Employee(int employeeId,String employeeName,double salary) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	

}
