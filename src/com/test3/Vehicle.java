package com.test3;

public class Vehicle {
String vehicleModel;
String licencePlate;
double batteryCapacity;
double rentalPricePerHour;

public void setElectricVehicleDetails(String vehicleModel,String licencePlate,double batteryCapacity,double rentalPricePerHour) {
	this.vehicleModel=vehicleModel;
	this.licencePlate=licencePlate;
	this.batteryCapacity=batteryCapacity;
	this.rentalPricePerHour=rentalPricePerHour;
}
public String getElectricVehicleDetails() {
	return " "+vehicleModel+" "+licencePlate+" "+batteryCapacity+" "+rentalPricePerHour;
}
}
