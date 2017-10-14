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

            case REGISTERED_PUB_CODE:
                isRunning = false;
                new RegisteredPublication().execute();
                break;
            case CREATOR_PUB_CODE:
                isRunning = false;
                new CreatorPublication().execute();
                break;
            case DISPLAY_PUB_CODE:
                isRunning = false;
                new DisplayPublication().execute();
                break;
            case CLEANER_PUB_CODE:
                isRunning = false;
                new CleanerPublication().execute();
                break;
            case EXIT_MENU_CODE:
                isRunning = false;
                break;
            default:
                System.out.println(INCORRECT_COMMAND + command);
        }
    }

    private void showMenu() {

        System.out.printf(FORMAT_MENU_HEADER, EMPTY, MENU, EMPTY);

        System.out.printf(FORMAT_MENU_BODY, CODE, LABEL);

        System.out.println(SEPARATOR);

        System.out.printf(FORMAT_MENU_BODY, REGISTERED_PUB_CODE, ITEM_MENU_REGISTRED_PUB);
        System.out.printf(FORMAT_MENU_BODY, CREATOR_PUB_CODE, ITEM_MENU_CREATOR_PUB);
        System.out.printf(FORMAT_MENU_BODY, DISPLAY_PUB_CODE, ITEM_MENU_DISPLAY_PUB);
        System.out.printf(FORMAT_MENU_BODY, CLEANER_PUB_CODE, ITEM_MENU_CLEANER_PUB);
        System.out.printf(FORMAT_MENU_BODY, EXIT_MENU_CODE, ITEM_MENU_EXIT_MENU);
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
