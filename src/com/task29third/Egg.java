package com.task29third;

public class Egg extends Food {
	 
	
	
	
	public Egg(double proteins,double fats,double carbs,double tastyScore) {
		super(proteins,fats,carbs,tastyScore);
	}
	
	int tastyScore=7;
	String type="non-vegeterian";
	
	
	
	

	@Override
	public void getMacroNutrients() {
		System.out.println("Egg is "+type);
		System.out.println("An egg has"+this.proteins+"gms of protiens ,"+this.fats+"gms of fats and"+this.carbs+"gms of carbohyfrates.");
		System.out.println("Taste: "+tastyScore);
	}

}
