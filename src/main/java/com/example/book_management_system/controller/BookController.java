package com.example.book_management_system.controller;

import com.example.book_management_system.entity.Book;
import com.example.book_management_system.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service)
    {
        this.service=service;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book)
    {
        return service.saveBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookId(@PathVariable Long id)
    {
        return service.getBookId(id);
    }

    @GetMapping
    public List<Book> getAllBooks()
    {
        return service.getAllBooks();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,@RequestBody Book book)
    {
        return service.updateBook(id,book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id)
    {
        service.deleteBook(id);
        return "Book Deleted Successfully";
    }
}
