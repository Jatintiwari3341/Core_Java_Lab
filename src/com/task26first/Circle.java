package com.task26first;

public class Circle  extends Shape{

	public Circle() {
		super();
	}
	@Override
	
	public void draw() {
		System.out.println("Circle Draw");
	}
	
	@Override
	public void erase() {
		System.out.println("Circle erase");
	}
	
}
