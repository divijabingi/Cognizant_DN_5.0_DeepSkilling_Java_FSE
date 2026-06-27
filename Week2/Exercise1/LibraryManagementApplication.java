package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.repository.BookRepository;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);
        
        bookService.addBook("Java Programming");
        bookRepository.save("Java Programming");
        System.out.println();
        
        bookService.addBook("Database Systems");
        bookRepository.save("Database Systems");
        System.out.println();
        
        bookService.listBooks();
        bookRepository.findAll();
    }

}
