package com.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<String> books = new ArrayList<>();

    public void save(String bookName) {
        books.add(bookName);
        System.out.println("Book Added: " + bookName);
    }

    public void findAll() {
        System.out.println("Books Available:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }
}