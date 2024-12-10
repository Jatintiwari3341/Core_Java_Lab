package com.test2;

import java.util.Scanner;

public class Game {
	
	String game;
	String developer;
	int stockCapacity;
	
	public void  setInventoryDetails(String game,String developer,int stockCapacity) {
		this.game=game;
		this.developer=developer;
		this.stockCapacity=stockCapacity;
	}
	
	public String getInventoryDetails() {
		return " "+game+" "+developer+" "+stockCapacity;
			}

}
