package com.task26sec;

public class HostpitalManagement {
	
	public static void main(String args[]) {
		HospitalStaff h1=new HospitalStaff("smith",22,"therapyst");
		h1.Work();
		Doctor d1=new Doctor("Scott",34,"surgeon","heart specilist");
		d1.Work();
		Nurse n1=new Nurse("Maya",21," junior Nurse",2);
		n1.Work();
		
	}

}
