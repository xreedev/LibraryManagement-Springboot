package com.example.LibraryManagementApplication.Control;
import com.example.LibraryManagementApplication.Service.BookService;
import com.example.LibraryManagementApplication.Model.Book;
import com.example.LibraryManagementApplication.Configs.ApiRoutes;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
    public BookService bookService;

    @GetMapping(ApiRoutes.BOOK)
    private Book getBooks(@PathVariable("bookid") String bookid)
    {return bookService.getBookById(bookid);}

    @PostMapping()
    private String saveBook(@RequestBody Book books)
    {
        bookService.createBook(books);
        return books.getBookId();
    }
}


