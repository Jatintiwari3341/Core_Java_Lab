package com.task32sec;

import java.util.function.BiConsumer;

public class Consumer_test {

	public static void main(String[] args) {
		
		BiConsumer<Integer,String>var=(num,str)->{
			num=num*num;
			str=str.toUpperCase();
			System.out.println("The square of number "+num);
			System.out.println("Updated String"+str);
			
		};
		int number=5;
		String text="hello";
		var.accept(number, text);
		
		System.out.println("Original value :"+number);
		System.out.println("Original value :"+text);
	  }
	}


