package com.task29first;

public class TesterClass {

	public static void main(String[] args) {
		Shape s1=new Rectangle("Rectangle",30.3,45.4);
		s1.getArea();
		s1.printDetails();
		System.out.println();
		Shape s2=new Circle("Circle",23.2);
		s2.getArea();
		s2.printDetails();
		System.out.println();
		Shape s3=new Triangle("Triangle",146.2,40.0);
		s3.getArea();
		s3.printDetails();
	}

}
