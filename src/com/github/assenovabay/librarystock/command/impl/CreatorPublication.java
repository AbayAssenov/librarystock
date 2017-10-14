package com.github.assenovabay.librarystock.command.impl;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.constant.LibraryConstatnt;
import com.github.assenovabay.librarystock.entity.impl.Book;
import com.github.assenovabay.librarystock.entity.impl.Booklet;
import com.github.assenovabay.librarystock.entity.impl.Magazine;
import com.github.assenovabay.librarystock.storage.impl.ArrayStorage;
import com.github.assenovabay.librarystock.util.Validator;

import java.util.Scanner;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.*;

/**
 * @author Abay Assenov
 *         10/10/2017
 */
public class CreatorPublication implements Action {

    private Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;

    private void createBook() {

        Book book = new Book();

        System.out.println(ADD_PUBLICATION);

        System.out.println(INPUT_NAME_PUB+MAX_COUNT_20);
        book.setName(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_20));

        System.out.println(INPUT_NAME_AUTHOR_PUB+MAX_COUNT_15);
        book.setAuthor(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_15));

        System.out.println(INPUT_GENRE_PUB+MAX_COUNT_15);
        book.setGenre(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_15));

        System.out.println(INPUT_YEAR_PUB+MAX_COUNT_4);
        book.setYear(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_4));

        System.out.println(INPUT_COUNT_PAGE_PUB+MAX_COUNT_5);
        book.setCountPage(Validator.takeLimitNumber(scanner.nextLine(), MAX_COUNT_5));

        System.out.println(INPUT_NAME_PUBLISHER_PUB+MAX_COUNT_15);
        book.setPublisher(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_15));

        System.out.println(INPUT_SHORT_DISCRIPTION_PUB+MAX_COUNT_40);
        book.setDescription(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_40));

        System.out.println(ADDED);

        ArrayStorage.INSTANCE.create(book);
    }

    private void createMagazine() {

        Magazine magazine = new Magazine();

        System.out.println(ADD_PUBLICATION);

        System.out.println(INPUT_NAME_PUB+MAX_COUNT_20);
        magazine.setName(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_20));

        System.out.println(INPUT_MONTH_PUB+MAX_COUNT_15);
        magazine.setMonth(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_15));

        System.out.println(INPUT_YEAR_PUB+MAX_COUNT_20);
        magazine.setYear(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_20));

        System.out.println(INPUT_COUNT_PAGE_PUB+MAX_COUNT_4);
        magazine.setCountPage(Validator.takeLimitNumber(scanner.nextLine(), MAX_COUNT_4));

        System.out.println(INPUT_NAME_PUBLISHER_PUB+MAX_COUNT_15);
        magazine.setPublisher(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_15));

        System.out.println(INPUT_ARTICLES_PUB+MAX_COUNT_40);
        magazine.setDescription(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_40));

        System.out.println(ADDED);

        ArrayStorage.INSTANCE.create(magazine);
    }

    private void createBooklet() {

        Booklet booklet = new Booklet();

        System.out.println(ADD_PUBLICATION);

        System.out.println(INPUT_NAME_PUB+MAX_COUNT_20);
        booklet.setName(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_20));

        System.out.println(INPUT_MONTH_PUB+MAX_COUNT_15);
        booklet.setMonth(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_15));

        System.out.println(INPUT_YEAR_PUB+MAX_COUNT_4);
        booklet.setYear(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_4));

        System.out.println(INPUT_NAME_PUBLISHER_PUB+MAX_COUNT_15);
        booklet.setPublisher(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_15));

        System.out.println(INPUT_SHORT_DISCRIPTION_PUB+MAX_COUNT_40);
        booklet.setDescription(Validator.takeLimitString(scanner.nextLine(), MAX_COUNT_40));

        System.out.println(ADDED);

        ArrayStorage.INSTANCE.create(booklet);
    }

    private void defineCommand(String command) {

        switch (command) {

            case RETURN_MENU_CODE:

                new MenuPublication().execute(); //Show menu library
                break;

            case CREATE_BOOKLET_CODE:

                createBooklet();
                new CreatorPublication().execute(); //Show items of menu
                break;

            case CREATE_MAGAZINE_CODE:

                createMagazine();
                new CreatorPublication().execute(); //Show items of menu
                break;

            case CREATE_BOOK_CODE:

                createBook();
                new CreatorPublication().execute(); //Show items of menu
                break;

            default: {
                isRunning = true; //Continue scanner of menu
                System.out.println(INCORRECT_COMMAND + command);
            }
        }
    }

    @Override
    public void execute() {

        System.out.println(ADD_NEW_PUBLICATION);

        System.out.println(LibraryConstatnt.SEPARATOR);

        System.out.printf(FORMAT_CREATOR_COMMAND_BODY, CODE, LABEL);

        System.out.println(LibraryConstatnt.SEPARATOR);

        System.out.printf(FORMAT_CREATOR_COMMAND_BODY, CREATE_BOOKLET_CODE, ADD_BOOKLET);

        System.out.printf(FORMAT_CREATOR_COMMAND_BODY, CREATE_MAGAZINE_CODE, ADD_MAGAZINE);

        System.out.printf(FORMAT_CREATOR_COMMAND_BODY, CREATE_BOOK_CODE, ADD_BOOK);

        System.out.println(FOR_RETURN_MENU);

        System.out.println(INPUT_COMMAND);

        while (isRunning) { //Waiting need command

            isRunning = false; //Stop scanner of menu

            defineCommand(scanner.nextLine());
        }
    }
}