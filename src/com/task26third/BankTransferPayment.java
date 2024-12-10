package com.task26third;

public class BankTransferPayment extends Payment {

	
	@Override
	public void processPayment() {
		System.out.println("Processing bank tranfer payment ");
	}
}
