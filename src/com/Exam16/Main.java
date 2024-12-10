package com.Exam16;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(12,"smith",2000);
		double bonus=e1.calculateBounus();
		System.out.println(bonus);
		System.out.println(e1);
		

	}

}
