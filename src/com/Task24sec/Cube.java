package com.Task24sec;

public class Cube extends Shape {
    @Override
	public double calculateVolumeCube(double sideLength) {
    	if(sideLength<0) {
    		System.err.println("side length can not be negative");
    		return 0.0;
    	}
    	else {
		double cube=sideLength*sideLength*sideLength;
		return cube;
    	}
	}

	
    

}
