package com.task23;

public class BookBorrowing {
private String bookTittle;
private String borrowerName;
public BookBorrowing(String bookTittle, String borrowerName) {
	super();
	this.bookTittle = bookTittle;
	this.borrowerName = borrowerName;
}
public String getBookTittle() {
	return bookTittle;
}
public String getBorrowerName() {
	return borrowerName;
}
@Override
public String toString() {
	return "BookBorrowing [bookTittle=" + bookTittle + ", borrowerName=" + borrowerName + "]";
}


}
