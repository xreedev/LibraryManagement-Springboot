package com.example.LibraryManagementApplication.Model;

public class Book {
    private String name;
    private String bookId;
    private String author;

    public Book(String name, String bookId, String author) {
        this.name = name;
        this.bookId = bookId;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
