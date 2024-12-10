package com.task29third;

public class Bread extends  Food {

	public Bread(double proteins, double fats, double carbs, double tastyScore) {
		super(proteins, fats, carbs, tastyScore);
		
	}
	int tastyScore=8;
	String type="vegeterian";
	@Override
	public void getMacroNutrients() {
		System.out.println("Bread is "+type);
		System.out.println("An slice of bread"+this.proteins+"gms of protiens ,"+this.fats+"gms of fats and"+this.carbs+"gms of carbohyfrates.");
		System.out.println("Taste: "+tastyScore);
	}

}
