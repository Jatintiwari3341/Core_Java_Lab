package com.task23;

public class MagazineBorrowing {
	private String magazineTitle;
	private String borrowerName;
	public MagazineBorrowing(String magazineTitle, String borrowerName) {
		super();
		this.magazineTitle = magazineTitle;
		this.borrowerName = borrowerName;
	}
	public String getMagazineTitle() {
		return magazineTitle;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	@Override
	public String toString() {
		return "MagazineBorrowing [magazineTitle=" + magazineTitle + ", borrowerName=" + borrowerName + "]";
	}
	
	
	
	
	

}
