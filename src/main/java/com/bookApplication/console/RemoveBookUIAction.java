package com.bookApplication.console;

import com.bookApplication.service.RemoveBookService;

import java.util.Scanner;

public class RemoveBookUIAction implements UIAction{

    private final RemoveBookService removeBookService;

    public RemoveBookUIAction(RemoveBookService removeBookService) {
        this.removeBookService = removeBookService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id to remove: ");
        Long bookId = Long.parseLong(scanner.nextLine());
        removeBookService.execute(bookId);
        System.out.println("Your book was removed from list.");
    }
}
