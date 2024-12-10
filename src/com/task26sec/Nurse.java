package com.task26sec;

public class Nurse extends HospitalStaff {
	
	private int yearOfExperiance;

	public Nurse(String name, int age, String role, int yearOfExperiance) {
		super(name, age, role);
		this.yearOfExperiance = yearOfExperiance;
	}
	
	@Override
	public void Work() {
		System.out.println(getRole()+"--- "+getName()+" With "+this.yearOfExperiance+" years of experince is taking care of patients");
	}
	
	

}
