package com.task29first;

public class Circle extends Shape {
	String name;
	double radius;
	
	

	public Circle(String name, double radius) {
		super();
		this.name = name;
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double pi=3.14;
		double area=pi*this.radius*this.radius;
		return area;
	}

	@Override
	public double printDetails() {
		System.out.println("the type ="+this.name);
		System.out.println("the radius ="+this.radius);
		System.out.println("the area ="+this.getArea());
		return 0.0;
	}

}
