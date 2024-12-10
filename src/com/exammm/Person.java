package com.exammm;

public class Person {
	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("the name of the person is "+this.name);
		System.out.println("the age of the person is "+this.age);
	}
}
