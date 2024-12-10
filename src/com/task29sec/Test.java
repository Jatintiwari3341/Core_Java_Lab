package com.task29sec;

public class Test extends Car {

	@Override
	public void display() {
		System.out.println("The Brand of the car is :"+carBrand());
		System.out.println("The model of the car is :"+carModel());
		System.out.println("The mileage of car is :"+carMileage());
		System.out.println("The speed of the car is :"+this.carTopSpeed());
		System.out.println("The year of manufactoring is :" +this.year());

	}
	public static void main(String[] args) {
		Test t1=new Test();
		
		t1.display();
	}

}
