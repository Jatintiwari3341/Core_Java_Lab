package com.task31third;

public class InstagramChatTest {

	public static void main(String[] args) {
  User user=new User("john doe");
  InstagramUser iu=new InstagramUser("v.Smith");
		  InstagramChat ic=new InstagramChat();
  System.out.println("Testing with general message");
  ic.sendMessage(user);
  System.out.println("Testing with Instagram user");
  ic.sendMessage(iu);
  System.out.println("Demonstrating message directly");
 iu.sendDirectMessage("Hello from  Instagram");
 iu.displayMessage("Direct message received");

	}

}
