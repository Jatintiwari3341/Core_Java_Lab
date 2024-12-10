package com.task31sec;

public class SimpleClass implements Calculator{

//	@Override
	public void calculateSum(int... var) {
		int sum=0;
		for(int v :var) {
			
			sum+=v;
			
		}
		System.out.println("The sum of number is "+sum);
		
	}

}
