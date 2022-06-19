package com.CH2;

public class BookList {
    public static void main(String[] args) {
        Book b = new Book("Light and Dawn", 4563.275);
        System.out.println(b);

        Book b2 = new Book();
        b2.setBookTitle("Moon Knight");
        b2.setBookPrice(3233.457);
        System.out.println(b2);

        Book b3 = new Book();
        b3.setBookTitle("Th King is Back");
        b3.setBookPrice(45645.25);
        System.out.println("BOOK :: [bookTitle :: '"+b3.getBookTitle()+"', bookPrice :: "+b3.getBookPrice()+"]");
    }
}
