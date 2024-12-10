package com.has;

public class Engine {
  
	String model;
	String engine;
	public Engine(String model, String engine) {
		super();
		this.model = model;
		this.engine = engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", engine=" + engine + "]";
	}
	
	
	
}
