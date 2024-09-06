package com.example.LibraryManagementApplication.Control;
import com.example.LibraryApplication.Service.BookService;
import com.example.LibraryApplication.Model.Book;
import com.example.LibraryManagementApplication.Configs.ApiRoutes;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    public BookService bookService;

    @GetMapping(ApiRoutes.BOOK)
    private Book getBooks(@PathVariable("bookid") String bookid)
    {return bookService.getBook(bookid);}

    @PostMapping()
    private String saveBook(@RequestBody Book books)
    {
        bookService.createBook(books);
        return books.getBookId();
    }
}


