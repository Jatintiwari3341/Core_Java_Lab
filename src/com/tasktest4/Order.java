package com.tasktest4;

public class Order {
	private int orderId;
	private String itemName;
	private double itemPrice;
	public Order(int orderId, String itemName, double itemPrice) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	
	

}
