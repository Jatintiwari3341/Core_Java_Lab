package com.task29third;

public abstract class Food {
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	
	
	public Food(double proteins, double fats, double carbs, double tastyScore) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = tastyScore;
	}


	public  abstract void getMacroNutrients(); 

}
