package com.task26third;

public class PayPalPayment extends Payment {
	
	@Override
	public void processPayment() {
		System.out.println("Processing paypal payment");
	}

}
