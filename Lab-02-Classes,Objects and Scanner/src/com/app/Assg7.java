package com.app;

import java.util.Scanner;

class Book {
	String book_title;
	double book_price;
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
}

class BookInfo {
	
	public void booknote() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the book title");
		String bookname = sc.nextLine();
		
		System.out.println("Enter book price");
		double bookprice = sc.nextDouble();
		
		Book b = new Book();
		b.setBook_title(bookname);
		b.setBook_price(bookprice);
		System.out.println("Book Details");
		System.out.println("Book Title :: "+b.getBook_title());
		System.out.println("Book Price :: "+b.getBook_price());
		
		sc.close();
	}
}

public class Assg7 {
	
	public static void main(String[] args) {
		BookInfo bi = new BookInfo();
		bi.booknote();
	}
	
}
