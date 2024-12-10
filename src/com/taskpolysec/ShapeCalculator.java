package com.taskpolysec;

public class ShapeCalculator {
	public int calculateSquare(int side1,int side2) {
		if(side1<0||side2<0) {
			System.err.println("Side Length must be non negative.");
			return 0;
		}
		else {
		return side1*side2;
		}
	}
	
	public int calculateArea(int length,int width) {
		if(length<0||width<0) {
			System.err.println("length and width must be non negative");
			return 0;
		}
		else {
		return length*width;
		}
	}
	
	public double calculateArea(double radius) {
		double pi=3.14;
		return pi*radius*radius;
	}
	

}
