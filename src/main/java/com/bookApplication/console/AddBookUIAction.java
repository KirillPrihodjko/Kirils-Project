package com.bookApplication.console;

import com.bookApplication.service.AddBookService;

import java.util.Scanner;

public class AddBookUIAction implements UIAction{

    private final AddBookService addBookService;

    public AddBookUIAction(AddBookService addBookService) {
        this.addBookService = addBookService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Enter book author: ");
        String bookAuthor = scanner.nextLine();
        addBookService.execute(bookTitle, bookAuthor);
        System.out.println("Your book was added to list.");
    }
}
