package com.bookApplication.database;

import com.bookApplication.domain.Book;

import java.util.List;

public interface Database {

    void save(Book book);

    void deleteById(Long id);

    List<Book> getAllBooks();
}
