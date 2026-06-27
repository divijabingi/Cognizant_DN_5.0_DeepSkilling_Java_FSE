package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Book: " + bookName);
        bookRepository.save(bookName);
    }

    public void listBooks() {
         System.out.println("Accessing BookRepository through Dependency Injection.");
        System.out.println("Displaying Library Books...");
        bookRepository.findAll();
    }
}
