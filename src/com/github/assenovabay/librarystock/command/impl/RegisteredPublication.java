package com.github.assenovabay.librarystock.command.impl;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.entity.Publication;
import com.github.assenovabay.librarystock.storage.impl.ArrayStorage;

import java.util.Scanner;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.*;

/**
 * @author Abay Assenov
 *         10/10/2017
 */
public class RegisteredPublication implements Action {

    /**
     * Shows all available publications
     */

    private void showPublication() {

        System.out.printf(FORMAT_REGISTERED_PUB_HEADER, EMPTY, REGISTERED_PUBLICATION, EMPTY);

        System.out.println(SEPARATOR);

        System.out.printf(FORMAT_REGISTERED_PUB_BODY, ID, TYPE, LABEL, RELASE_DATA, COUNT_PAGE, PUBLISHER);

        System.out.println(SEPARATOR);

        for (int i = 0; i < ArrayStorage.INSTANCE.readAll().size(); i++) {

            Publication currentPublication = ArrayStorage.INSTANCE.readAll().get(i);

            currentPublication.setIdStorage(i);

            System.out.println(currentPublication);
        }
    }


    @Override
    public void execute() {

        showPublication();

        System.out.println(FOR_RETURN_MENU);

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) { //Waiting need command

            String command = scanner.next();

            if (RETURN_MENU_CODE.equals(command)) {

                isRunning = false;
            } else {

                System.out.println(INCORRECT_COMMAND + command);
            }
        }

        new MenuPublication().execute(); //Display Publication menu


    }
}
