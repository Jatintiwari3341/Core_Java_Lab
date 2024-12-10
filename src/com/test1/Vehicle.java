package com.test1;

import java.util.Scanner;

public class Vehicle {
	
	    String vehicleModel;
	    String licencePlate;
	    double batteryCapacity;
	    double rentalpricePerHour;

	    public void setElectricDetails(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the vehicle moddel");
	        vehicleModel=sc.nextLine();
	        vehicleModel=sc.nextLine();
	        
	        System.out.println("Enter the licence plate");
	        licencePlate=sc.nextLine();
	        licencePlate=sc.nextLine();
	        
	        System.out.println("Enter the battery capacity");
	       batteryCapacity=sc.nextDouble();
	       
	       System.out.println("enter the rentalpriceper hour");
	       rentalpricePerHour=sc.nextDouble();
	       sc.close();
	    }
	    
	    public void getElectricDetails() {
	    	System.out.println("the vehicle model is "+vehicleModel);
	    	System.out.println("the licence plate is +"+licencePlate);
	        System.out.println("the battery capacity is "+batteryCapacity);
	        System.out.println("the rental price per hour is "+rentalpricePerHour);
	    }
	        
	        

}
