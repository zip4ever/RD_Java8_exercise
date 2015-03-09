package com.realdolmen.education.java8.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KDAAU95 on 24/02/2015.
 */
public class BookCollection {

    private List<Book> books;

    public BookCollection() {
        this.books = new ArrayList<>();
    }

    public BookCollection(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printBooksBy(String author) {
        //todo Implement method
    }

    public void printBooksBy(String author, int year) {
        //todo Implement method
    }

    public void printBooksPublishedBetween(int startYear, int endYear) {
        //todo Implement method
    }

    public void printBooksByPublicationYear() {
        //todo Implement method
    }

    public void printBooksWrittenInALeapYear() {
        //todo Implement method
    }

    public void printBooksByAuthorName() {
        //todo Implement method
    }
}
