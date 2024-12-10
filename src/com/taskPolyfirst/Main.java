package com.taskPolyfirst;

public class Main {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		System.out.println("Sum of two integers "+c1.add(10,20));
		System.out.println("Sum of two doubles "+c1.add(10.0,20.0));
		System.out.println("multiply of two integers "+c1.multiply(4,5));
		System.out.println("multiply of two doubles "+c1.multiply(3.0,4.0));

	}

}
