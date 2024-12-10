package com.test3;

import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the model");
		String vehicleModel=sc.nextLine();
		
		System.out.println("enter licence plate");
		String licencePlate=sc.nextLine();
		
		System.out.println("Enter battery capacity");
		double batteryCapacity=sc.nextDouble();
		
		System.out.println("Enter the rental price per hour");
		double rentalPricePerHour=sc.nextDouble();
		
		v1.setElectricVehicleDetails(vehicleModel, licencePlate,batteryCapacity,rentalPricePerHour);
       String result=v1.getElectricVehicleDetails();
       System.out.println(result);
	}

}
