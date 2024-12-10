package com.task25sec;

public class Animal {
	public void makeSound() {
		System.out.println("Generic sound of animal");
	}

}
	class Dog extends Animal{
		public void makeSound() {
			System.out.println("The dog is barking");
		}
	}
	
	class Cat extends  Animal {
		public void makeSound() {
			System.out.println("The cat is meow");
		}
	
	
	}

