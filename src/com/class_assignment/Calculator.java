package com.class_assignment;

 interface Calculator {
	void sum(int x,int y);
	void sub(int x,int y);
	void mul(int x,int y);
	void div(int x,int y);
}
class ArithmeticOperation implements Calculator{

@Override
	public void sum(int x, int y) {
		System.out.println("The addition of Two number is :"+(x+y));
		
	}
	@Override
	public void sub(int x, int y) {
		System.out.println("The subtraction of Two number is :"+(x-y));
		
	}
	@Override
	public void mul(int x, int y) {
		System.out.println("The addition of Two number is :"+(x*y));
		
		
	}
	@Override
	public void div(int x, int y) {
		System.out.println("The addition of Two number is :"+(x/y));
		
	}
	

	
	
	
}
