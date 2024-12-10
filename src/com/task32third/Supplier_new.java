package com.task32third;

import java.util.function.Supplier;

public class Supplier_new{

	public static void main(String[] args) {
		
		Supplier<String>str= ()->"NIT"+(int)(Math.random()*10000);
		Supplier<Integer>num=()->(int)(Math.random()*100);
		System.out.println("Generated random integer :"+num.get());
		System.out.println("Generated random string :"+str.get());
	}

}
