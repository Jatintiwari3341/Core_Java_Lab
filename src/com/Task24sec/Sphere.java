package com.Task24sec;

public class Sphere extends Shape {
	public double calculateVolumeSphere(double radius) {
		   double PI=3.14;
		   double sphere=4/3*(PI*radius*radius);
		   return sphere;
	}
}
