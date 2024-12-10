package com.task26third;

public class Main {

	public static void main(String[] args) {
		Payment payments=new Payment();
		processMultiplePayments(new Payment(),new CreditCardPayment(), new PayPalPayment(), new BankTransferPayment());
	}
		public static void processMultiplePayments(Payment... payments) {
			
			for(Payment X:payments)
			{
				X.processPayment();
			}
					
		
	}

}
