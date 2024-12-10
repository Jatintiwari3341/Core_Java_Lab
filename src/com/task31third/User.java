package com.task31third;

class User{
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void displayMessage(String message) {
		System.out.println("User name is :"+name+"Message received :"+message);
	}
}
