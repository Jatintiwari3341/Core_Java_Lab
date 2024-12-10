package com.Task24sec;

public class Main {

	public static void main(String[] args) {
		Shape s1=new Shape();
		Cube c2=new Cube();
	double cube=c2.calculateVolumeCube(-3);
	System.out.println(cube);
	Cylinder c3=new Cylinder();
	
	 
	double cylinder=c3.calculateVolumeCylinder(2.0,2.0);
	System.out.println(cylinder);
	
	 Sphere s2=new Sphere();
	
	double sphere=s2.calculateVolumeSphere(2);
	System.out.println(sphere);
//		Cube c1=new Cube(3);

	}

}
