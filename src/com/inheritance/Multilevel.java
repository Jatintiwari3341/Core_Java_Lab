package com.inheritance;

class Shape1{
	protected int x;
	
	public Shape1(int x) {
		this.x=x;
		System.out.println("The value of x "+x);
	}
}

class Rectangle extends Shape1{
	protected int breadth;
	public Rectangle(int length,int breadth) {
		super(length);
		this.breadth=breadth;
	}
	public void getAreaRectangle() {
		double area=super.x*this.breadth;
		System.out.println("The area of rectangle is "+area);
		
	}
}
class Circle extends Shape1{
	final double PI=3.14;
	public Circle(int radius) {
		super(radius);
	}
	public void getAreaCircle() {
		double area=PI*super.x*super.x;
		System.out.println("The area of circle is "+area);
	}
	
}

public class Multilevel {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(2,5);
		r1.getAreaRectangle();
		
		Circle c1=new Circle(5);
		c1.getAreaCircle();

	}

}
