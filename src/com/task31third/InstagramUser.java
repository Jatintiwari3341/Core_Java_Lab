package com.task31third;

public class InstagramUser extends User {

	public InstagramUser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void sendDirectMessage(String message) {
		System.out.println("Instagram User"+getName()+ "sent message "+message);
		
	}

}
