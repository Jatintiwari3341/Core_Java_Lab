package com.tasktest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.nextLine();
			 name=sc.nextLine();
				System.out.println("enter salary");
				double sal=sc.nextDouble();
				Employee e1=new Employee(id,name,sal);
			System.out.println(e1);
		}
	}

}
