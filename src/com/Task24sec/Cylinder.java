package com.Task24sec;

public class Cylinder extends Shape{
	public double calculateVolumeCylinder(double radius,double height ) {
		double PI=3.14;
		double cylinder=PI*radius*radius*height;
		return cylinder;
	}
}
