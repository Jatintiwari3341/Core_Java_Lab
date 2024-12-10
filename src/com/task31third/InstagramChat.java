package com.task31third;

public class InstagramChat  implements Messanger{

	@Override
	public void sendMessage(User user) {
		if(user instanceof InstagramUser) {
			System.out.println("message sent successfully");
		}
		else {
			System.out.println("Error : User is not an Instagram user");
		}
		
	}
	
	

}
