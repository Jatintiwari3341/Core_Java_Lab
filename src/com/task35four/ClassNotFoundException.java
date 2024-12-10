package com.task35four;

import java.util.Scanner;

public class ClassNotFoundException {
	
	public ClassNotFoundException(String s1) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class name");
		String str=sc.nextLine();
		ClassNotFoundException c1=new ClassNotFoundException(str);
		
		
	}

}
