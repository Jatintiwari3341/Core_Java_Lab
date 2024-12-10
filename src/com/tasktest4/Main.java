package com.tasktest4;

public class Main {

	public static void main(String[]args) {
		Order o1=new Order(101,"perfume",400);
		Customer c1=new Customer(10,"ravi","hyderabad",o1);
		System.out.println(c1);
	}
}
