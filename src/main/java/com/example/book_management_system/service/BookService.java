package com.example.book_management_system.service;

import com.example.book_management_system.entity.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookId(Long id);
    Book updateBook(Long id,Book book);
    void deleteBook(Long id);

}
