package com.inheritance;

class Shape{
	protected int x;
	
	public Shape(int x) {
		this.x=x;
		
	}
}

class Square extends Shape{
	
	public Square(int side) {
		super(side);
		
	}
	
	public void getAreaSqaure() {
		double area=super.x*super.x;
		System.out.println("The area of square is "+area);
	}
}
public class SingleLevel {
	public static void main(String[] args) {
		Square ss=new Square(9);
	ss.getAreaSqaure();
	}

}
