package com.example.LibraryManagementApplication.Service;

import com.example.LibraryManagementApplication.Model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();

    Book getBookById(String bookId);

    Book createBook(Book book);

    Book updateBook(String bookId, Book updatedBook);

    void deleteBook(String bookId);
}
