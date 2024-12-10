package com.task31four;

public class EmailNotifier implements Notifier {

	@Override
	public void NotifyUser(int... users) {
		for(User user:users) {
			sendEmail(user);
		}

	}
	private void SendEmail(User user) {
		System.out.println("");
		
	}

}
