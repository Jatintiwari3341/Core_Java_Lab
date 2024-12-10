package com.task24;

public class Vehicle {
	private double  totalDistance;
	private double totalFuelConsumed;
	public Vehicle(double totalDistance, double totalFuelConsumed) {
		super();
		this.totalDistance = totalDistance;
		this.totalFuelConsumed = totalFuelConsumed;
	}
	public double calculateFuelEfficiency() {
		double fuelEfficeincy=totalDistance/totalFuelConsumed;
		return fuelEfficeincy;
	}
	public double calculateFuelEfficiency(double unit) {
		double efficiency= calculateFuelEfficiency()*unit;
		return efficiency;
		
	}

}
