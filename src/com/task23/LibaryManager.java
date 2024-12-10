package com.task23;

public class LibaryManager {

	public static void borrowItem(BookBorrowing borrowing) {
		if(borrowing.getBookTittle()==null||borrowing.getBookTittle().isBlank()) {
			System.err.println("Error:Book title can not be empty.");
		}
		else {
			System.out.println(borrowing.getBookTittle()+ " borrowed the book:"+borrowing.getBorrowerName());
		}
	}
		public void borrowItem(DVDBorrowing borrowing) {
			if(borrowing.getDvdTittle()==null) {
				System.err.println("Error:Book title can not be empty.");
			}
			else {
				System.out.println(borrowing.getBorrowerName()+ " borrowed the dvd:"+borrowing.getDvdTittle());
			}
			
		}
			
			public  void borrowItem(MagazineBorrowing borrowing) {
				if(borrowing.getMagazineTitle()==null) {
					System.err.println("Error:Book title can not be empty.");
				}
				else {
					System.out.println(borrowing.getBorrowerName()+ " borrowed the magzine:"+borrowing.getMagazineTitle());
				}
			}
			
	
		
		
	}

	

