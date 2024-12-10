package com.task26first;

public class Shape
{
	
	public Shape() {
		super();
}
	public static Shape randShape() {
		int randomnum=(int)(Math.random()*3);
		
		switch(randomnum) {
		case 0:
			return new Circle();
			
		case 1:
			return new Triangle();
				
		case 2:
			return new Square();
			
			default:
				System.out.println("default case");
				return new Shape();
		}	
		}
		public void draw() {
			System.out.println("Shape Draw");
		}
		public void erase() {
			System.out.println("Shape erase");
		}
		
		
		

	
	}


