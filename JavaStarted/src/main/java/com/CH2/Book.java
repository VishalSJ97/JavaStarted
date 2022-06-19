package com.CH2;

public class Book {
    String bookTitle;
    double bookPrice;

    Book(String bookTitle, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
    }

    public Book() {

    }

    String getBookTitle() {
        return bookTitle;
    }

    double getBookPrice() {
        return bookPrice;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book :: [" +
                "bookTitle :: '" + bookTitle + '\'' +
                ", bookPrice :: " + bookPrice +
                ']';
    }
}
