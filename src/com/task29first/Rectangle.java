package com.task29first;

public class Rectangle extends Shape {
	String name;
	double length;
	double breadth;
	
	public Rectangle(String name,double length,double breadth) {
		this.name=name;
		this.length=length;
		this.breadth=breadth;
	}
	
	

	
	@Override
	public double getArea() {
		double area=this.length*this.breadth;
		//System.out.println("The area of the rectangle is :"+area);
		return area;
	}

	@Override
	public double printDetails() {
		System.out.println("the type ="+this.name);
		System.out.println("the length ="+this.length);
		System.out.println("the breadth ="+this.breadth);
		System.out.println("the area ="+this.getArea());
		return 0.0;
	}

}
