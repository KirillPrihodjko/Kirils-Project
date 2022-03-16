package com.bookApplication.service;

import com.bookApplication.Book;
import com.bookApplication.database.Database;

public class AddBookService {

    private final Database database;

    public AddBookService(Database database) {
        this.database = database;
    }

    public void execute(String bookTitle, String bookAuthor) {
        Book book = new Book(bookTitle, bookAuthor);
        database.save(book);
    }
}
