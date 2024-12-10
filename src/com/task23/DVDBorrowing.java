package com.task23;

public class DVDBorrowing {
	
	private String dvdTittle;
	private String borrowerName;
	public DVDBorrowing(String dvdTittle, String borrowerName) {
		super();
		this.dvdTittle = dvdTittle;
		this.borrowerName = borrowerName;
	}
	public String getDvdTittle() {
		return dvdTittle;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	@Override
	public String toString() {
		return "DVDBorrowing [dvdTittle=" + dvdTittle + ", borrowerName=" + borrowerName + "]";
	}
	
	
	

}
