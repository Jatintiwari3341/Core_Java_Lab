package com.task29first;

public class Triangle extends Shape {
	String name;
	double base;
	double height;
	
	

	public Triangle(String name, double base, double height) {
		super();
		this.name = name;
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		double area=(1*base*height)/2;
		return area;
	}

	@Override
	public double printDetails() {
		System.out.println("the type ="+this.name);
		System.out.println("the base ="+this.base);
		System.out.println("the height ="+this.height);
		System.out.println("the area ="+this.getArea());
		return 0.0;
	}

}
