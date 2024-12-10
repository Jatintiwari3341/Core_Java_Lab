package com.task32first;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_Inter {
	
	Predicate<Integer> isPrime;
	Predicate<Integer> isEven;
	
	public void testPredicate() {
		
		isEven=num ->num%2==0;
		isPrime=num->{
			int count=0;
			if(num<=1)return false;
			for(int i=1;i<=num;i++){
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				return true;
			}
			
			return false;	
				
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(isEven.test(n)) {
			System.out.println("Is even  : "+true);
		}else {
			System.out.println("Is even  : "+false);

		}
		if(isPrime.test(n)) {
			System.out.println("Is Prime  : "+true);
		}else {
			System.out.println("Is prime  : "+false);

		}
		sc.close();
	
	}
	
	

	public static void main(String[] args) {
		
		Predicate_Inter p=new Predicate_Inter();
		p.testPredicate();
		
		
}
	
}

