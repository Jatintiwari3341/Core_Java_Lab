package com.task26sec;

public class Doctor extends HospitalStaff {
	
	private String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}
	
	@Override
	public void Work() {
		System.out.println(getRole()+ "--- "+getName()+" speciliazation in "+this.specialization+" is treating patient");
	}

}
