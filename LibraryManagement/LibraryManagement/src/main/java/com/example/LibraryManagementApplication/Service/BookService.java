package com.example.LibraryManagementApplication.Service;

import com.example.LibraryManagementApplication.Model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements IBookService {

    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book createBook(Book book) {
        books.add(book);
        return book;
    }

    @Override
    public Book updateBook(String bookId, Book updatedBook) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                book.setName(updatedBook.getName());
                book.setAuthor(updatedBook.getAuthor());
                return book;
            }
        }
        return null;
    }

    @Override
    public void deleteBook(String bookId) {
        books.removeIf(book -> book.getBookId().equals(bookId));
    }
}


