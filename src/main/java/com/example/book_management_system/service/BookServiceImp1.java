package com.example.book_management_system.service;

import com.example.book_management_system.entity.Book;
import com.example.book_management_system.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp1 implements BookService {
    private final BookRepository repository;

    public BookServiceImp1(BookRepository repository) {
        this.repository = repository;
    }

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Book updateBook(Long id, Book book) {
        Book existing=repository.findById(id).orElse(null);
        if(existing!=null)
        {
            existing.setTitle(book.getTitle());
            existing.setAuthor(book.getAuthor());
            existing.setPrice(book.getPrice());
            return repository.save(existing);

        }
        return null;
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);

    }
}
