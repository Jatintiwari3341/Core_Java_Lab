package com.task23;

public class Main {

	public static void main(String[] args) {
		LibaryManager lm=new LibaryManager();
		BookBorrowing book=new BookBorrowing(null,"Alice");
	   
		lm.borrowItem(book);
		
		DVDBorrowing  dvd=new DVDBorrowing ("all","aaaa");
//		sSystem.out.println(dvd);
		lm.borrowItem(dvd);
		MagazineBorrowing mag=new MagazineBorrowing("Time","Charlie");
	
		lm.borrowItem(mag);
	}

}
