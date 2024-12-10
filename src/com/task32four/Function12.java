package com.task32four;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

//import java.util.function.Function;

public class Function12 {
	public static void main(String[] args) {
		Function<String,Integer> f=str->str.length();
		BiFunction<Integer,Integer,Double>f2=(num1,num2)->(double)(num1/num2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.nextLine();
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		Integer length=f.apply(name);
		double result=f2.apply(num1, num2);
		System.out.println("Length of :"+name+" :"+length);
		System.out.println("The result is :"+result);
		sc.close();
		
	}
	
	

}
