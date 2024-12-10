package com.test2;

import java.util.Scanner;

public class GameDemo {
public static void main(String[] args) {
	Game g1=new Game();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the game");
	 String game=sc.nextLine();
	
	System.out.println("enter the developer");
	String developer=sc.nextLine();
	
	System.out.println("enter stockCapacity");
	int stockCapacity=sc.nextInt();
	sc.close();
	
	g1.setInventoryDetails(game,developer,stockCapacity);
	String result=g1.getInventoryDetails();
	System.out.println(result);
	
	}
	
}
	
	
	

