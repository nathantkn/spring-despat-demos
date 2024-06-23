package com.example.proxydemo;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public Book create(String author) {
        return new Book(author);
    }
}
