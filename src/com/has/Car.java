package com.has;

public class Car {
   String name,model;
   Engine engine;

public Car(String name, String model) {
	super();
	this.name = name;
	this.model = model;
	this.engine=new Engine("Battery","1500");
			
}
   
   
}
