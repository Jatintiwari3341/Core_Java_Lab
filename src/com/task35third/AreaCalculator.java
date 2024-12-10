package com.task35third;

import java.util.Scanner;

public class AreaCalculator {
	public static double calculateArea(double length, double width) {
		double area = 0;
		// try {
		if (length < 0 || width < 0) {
			throw new IllegalArgumentException("IllegalArgumentException caught: Dimensions must be positive: \nlength=" + length + ", width=" + width);
		}
		area = length * width;
		// }

		// catch (IllegalArgumentException e) {
		// System.out.println("Please provide input must be positive");
		// System.out.println(e.getMessage());
		// }
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double n1 = sc.nextDouble();
		System.out.println("Enter the width");
		double n2 = sc.nextDouble();

		try {
			double area = calculateArea(n1, n2);
			System.out.println("Area of rectangle with length " + n1 + "and width " + n2 + "is :" + area);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
