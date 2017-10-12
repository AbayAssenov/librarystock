package com.github.assenovabay.librarystock.command.impl;

import com.github.assenovabay.librarystock.command.Action;

import java.util.Scanner;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.*;

/**
 * @author Abay Assenov
 *         10/9/2017
 */
public class MenuPublication implements Action {

    private boolean isRunning = true;

    /**
     * Defines current command menu
     */

    private void defineCommand(String command) {

        switch (command) {
            case "01":
                isRunning = false;
                new RegisteredPublication().execute();
                break;
            case "02":
                isRunning = false;
                new CreatorPublication().execute();
                break;
            case "03":
                isRunning = false;
                new DisplayPublication().execute();
                break;
            case "04":
                isRunning = false;
                new CleanerPublication().execute();
                break;
            case "05":
                isRunning = false;
                break;
            default:
                System.out.println("Некоректная команда-> " + command);
        }

    }

    private void showMenu() {

        System.out.printf(FORMAT_MENU_HEADER, EMPTY, MENU, EMPTY);

        System.out.printf(FORMAT_MENU_BODY, CODE, LABEL);

        System.out.println(SEPARATOR);

        System.out.printf(FORMAT_MENU_BODY, "01", "Просмотр зарегистрированых изданий в фонде");
        System.out.printf(FORMAT_MENU_BODY, "02", "Добавление нового издания в фонд");
        System.out.printf(FORMAT_MENU_BODY, "03", "Просмотр информации выбраного издания");
        System.out.printf(FORMAT_MENU_BODY, "04", "Удаление выбраного издания");
        System.out.printf(FORMAT_MENU_BODY, "05", "Выход\n");
    }

    @Override
    public void execute() {

        showMenu();

        System.out.println(INPUT_COMMAND);

        Scanner scanner = new Scanner(System.in);

        while (isRunning) { //Waiting need command

            String command = scanner.next();

            defineCommand(command);
        }


    }
}
