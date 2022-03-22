package com.bookApplication.service;

import com.bookApplication.domain.Book;
import com.bookApplication.database.Database;

import java.util.List;

public class GetAllBooksService {

    private final Database database;

    public GetAllBooksService(Database database) {
        this.database = database;
    }

    public List<Book> execute() {
        return database.getAllBooks();
    }
}
