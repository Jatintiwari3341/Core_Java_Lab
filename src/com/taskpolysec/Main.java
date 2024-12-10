package com.taskpolysec;

public class Main {

	public static void main(String[] args) {
		ShapeCalculator s1=new ShapeCalculator();
		System.out.println("The area of square is "+s1.calculateSquare(-4, 4));
		System.out.println("The area of rectangle is "+s1.calculateArea(5, 8));
		System.out.println("The area of circle is "+s1.calculateArea(7.0));

	}

}
