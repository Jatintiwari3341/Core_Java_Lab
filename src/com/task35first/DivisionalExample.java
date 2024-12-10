package com.task35first;

import java.util.Scanner;

public class DivisionalExample {
	
	public static int performDivision(int dividend,int divisor) {
		try {
			System.out.println("the result of division is :"+dividend/divisor);
			//1throw new ArithmeticException("Divisio by zero"+dividend+"divisor by"+divisor);
			return 0;
		}catch(Exception e) {
			System.out.println("User please don't provide zero here");
			e.printStackTrace();
			
			
			return 0;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the divident");
		int num1=sc.nextInt();
		System.out.println("Enter the divisor");
		int num2=sc.nextInt();
		
		performDivision(num1, num2);
		sc.close();
	}

}
