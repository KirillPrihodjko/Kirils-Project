package com.bookApplication.service;

import com.bookApplication.database.Database;

public class RemoveBookService {

    private final Database database;

    public RemoveBookService(Database database) {
        this.database = database;
    }

    public void execute(Long bookId) {
        database.deleteById(bookId);
    }
}
