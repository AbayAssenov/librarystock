package com.github.assenovabay.librarystock.command.impl;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.constant.LibraryConstatnt;
import com.github.assenovabay.librarystock.entity.impl.Book;
import com.github.assenovabay.librarystock.entity.impl.Booklet;
import com.github.assenovabay.librarystock.entity.impl.Magazine;
import com.github.assenovabay.librarystock.storage.impl.ArrayStorage;

import java.util.Scanner;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.INPUT_COMMAND;

/**
 * @author Abay Assenov
 *         10/10/2017
 */
public class CreatorPublication implements Action {

    private Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;

    private void createBook() {

//TODO добавить ограничение на ввод

        Book book=new Book();
        
        System.out.println("Добавление журнала в фонд...");

        System.out.println("Введите наименование( не более 20 символов): ");
        book.setName(scanner.next());

        System.out.println("Введите название автора издания( не более 15 символов): ");
        book.setAuthor(scanner.next());

        System.out.println("Введите жанр издания( не более 15 символов): ");
        book.setGenre(scanner.next());

        System.out.println("Введите год издания( не более 4 символов): ");
        book.setYear(scanner.next());

        System.out.println("Введите кол-во страниц( не более 4 символов): ");
        book.setCountPage(scanner.nextInt());

        System.out.println("Введите название издательства( не более 15 символов): ");
        book.setPublisher(scanner.next());

        System.out.println("Введите краткое описание( не более 40 символов): ");
        book.setDescription(scanner.next());

        System.out.println("Добавленно...");

        ArrayStorage.INSTANCE.create(book);
    }

    private void createMagazine() {

//TODO добавить ограничение на ввод

        Magazine magazine = new Magazine();

        System.out.println("Добавление журнала в фонд...");

        System.out.println("Введите наименование( не более 20 символов): ");
        magazine.setName(scanner.next());

        System.out.println("Введите месяц издания( не более 4 символов): ");
        magazine.setMonth(scanner.next());

        System.out.println("Введите год издания( не более 4 символов): ");
        magazine.setYear(scanner.next());

        System.out.println("Введите кол-во страниц( не более 4 символов): ");
        magazine.setCountPage(scanner.nextInt());

        System.out.println("Введите название издательства( не более 15 символов): ");
        magazine.setPublisher(scanner.next());

        System.out.println("Введите список статей описание( не более 40 символов): ");
        magazine.setDescription(scanner.next());

        System.out.println("Добавленно...");

        ArrayStorage.INSTANCE.create(magazine);
    }

    //TODO добавить ограничение на ввод
    private void createBooklet() {

        Booklet booklet = new Booklet();

        System.out.println("Добавление брошюры в фонд...");

        System.out.println("Ведите наименование( не более 20 символов): ");
        booklet.setName(scanner.next());

        System.out.println("Ведите месяц издания( не более 4 символов): ");
        booklet.setMonth(scanner.next());

        System.out.println("Ведите год издания( не более 4 символов): ");
        booklet.setYear(scanner.next());

        System.out.println("Ведите название издательства( не более 15 символов): ");
        booklet.setPublisher(scanner.next());

        System.out.println("Ведите краткое описание( не более 40 символов): ");
        booklet.setDescription(scanner.next());

        System.out.println("Добавленно...");

        ArrayStorage.INSTANCE.create(booklet);
    }

    private void defineCommand(String command) {

        switch (command) {
            case "00":
                isRunning = false;
                new MenuPublication().execute();
                break;
            case "11":
                isRunning = false; //Stop scanner of menu
                createBooklet();
                new CreatorPublication().execute(); //Show items of menu
                break;
            case "12":
                isRunning = false; //Stop scanner of menu
                createMagazine();
                new CreatorPublication().execute(); //Show items of menu
                break;
            case "13":
                isRunning = false; //Stop scanner of menu
                createBook();
                new CreatorPublication().execute(); //Show items of menu
                break;
            default:
                System.out.println("Некоректная команда-> " + command);
        }
    }

    @Override
    public void execute() {

        System.out.println("Добавление нового издания");
        System.out.println(LibraryConstatnt.SEPARATOR);
        System.out.printf("%-10s%-20s%n", "11", "Добавить брошюру");
        System.out.printf("%-10s%-20s%n", "12", "Добавить журнал");
        System.out.printf("%-10s%-20s%n", "13", "Добавить книгу\n");
        System.out.println("\nДля возврата в меню введите команду: \"00\"  ");

        System.out.println(INPUT_COMMAND);

        while (isRunning) { //Waiting need command
            defineCommand(scanner.next());
        }


    }
}