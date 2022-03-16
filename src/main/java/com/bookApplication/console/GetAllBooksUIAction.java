package com.bookApplication.console;

import com.bookApplication.service.GetAllBooksService;

public class GetAllBooksUIAction implements UIAction {

    private final GetAllBooksService getAllBooksService;

    public GetAllBooksUIAction(GetAllBooksService getAllBooksService) {
        this.getAllBooksService = getAllBooksService;
    }

    @Override
    public void execute() {
        System.out.println("Book list: ");
        getAllBooksService.execute().forEach(System.out::println);
        System.out.println("Book list end.");
    }
}
