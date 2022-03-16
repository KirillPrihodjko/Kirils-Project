package com.bookApplication;

import com.bookApplication.console.AddBookUIAction;
import com.bookApplication.console.ExitUIAction;
import com.bookApplication.console.GetAllBooksUIAction;
import com.bookApplication.console.RemoveBookUIAction;
import com.bookApplication.console.UIAction;
import com.bookApplication.database.Database;
import com.bookApplication.database.InMemoryDatabaseImpl;
import com.bookApplication.service.AddBookService;
import com.bookApplication.service.GetAllBooksService;
import com.bookApplication.service.RemoveBookService;

import java.util.Scanner;

public class BookListApplication {

    private static final Database database = new InMemoryDatabaseImpl();
    private static final AddBookService addBookService = new AddBookService(database);
    private static final RemoveBookService removeBookService = new RemoveBookService(database);
    private static final GetAllBooksService getAllBooksService = new GetAllBooksService(database);
    private static final UIAction addBookUIAction = new AddBookUIAction(addBookService);
    private static final UIAction removeBookUIAction = new RemoveBookUIAction(removeBookService);
    private static final UIAction getAllBooksUIAction = new GetAllBooksUIAction(getAllBooksService);
    private static final UIAction exitUIAction = new ExitUIAction();

    public static void main(String[] args) {
        while (true) {
            printProgramMenu();
            int menuNumber = getMenuNumberFromUser();
            executeSelectedMenuItem(menuNumber);
        }
    }

    private static void printProgramMenu() {
        System.out.println();
        System.out.println("Program menu:");
        System.out.println("1. Add book to list");
        System.out.println("2. Delete book from list");
        System.out.println("3. Show all books in the list");
        System.out.println("4. Exit");
        System.out.println();
    }

    private static int getMenuNumberFromUser() {
        System.out.println("Enter menu item number to execute:");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static void executeSelectedMenuItem(int selectedMenu) {
        switch (selectedMenu) {
            case 1: {
                addBookUIAction.execute();
                break;
            }
            case 2: {
                removeBookUIAction.execute();
                break;
            }
            case 3: {
                getAllBooksUIAction.execute();
                break;
            }
            case 4: {
                exitUIAction.execute();
                break;
            }
        }
    }
}
