package com.task29sec;

public abstract class Car {
String brand;
String model;
int mileage;
int top_speed;
int yearOfManufactoring;
public Car() {
	super();
}

public String carBrand() {
	brand="Mahindra";
	return brand;
}
public String carModel() {
	model="Thar";
	return model;
}
public int carMileage() {
	mileage=15;
	return mileage;
}
public int carTopSpeed() {
	top_speed=60;
	return top_speed;
}

public int year() {
	yearOfManufactoring=2023;
	return yearOfManufactoring;
}
public abstract void display();
}
