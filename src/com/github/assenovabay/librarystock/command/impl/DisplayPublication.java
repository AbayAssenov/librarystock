package com.github.assenovabay.librarystock.command.impl;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.entity.Publication;
import com.github.assenovabay.librarystock.storage.impl.ArrayStorage;

import java.util.Scanner;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.*;

/**
 * @author Abay Assenov
 *         10/12/2017
 */

public class DisplayPublication implements Action {

    private void displayFromStorage(Integer idPubInStorage) {

        try {

            Publication currentPublication = ArrayStorage.INSTANCE.read(idPubInStorage);

            currentPublication.setIdStorage(idPubInStorage); //Set id publication from array (index)

            System.out.printf(FORMAT_REGISTERED_PUB_BODY, ID, TYPE, LABEL, RELASE_DATA, COUNT_PAGE, PUBLISHER);

            System.out.println(currentPublication);

        } catch (IndexOutOfBoundsException i) {

            System.out.println(HAVE_NOT_PUB + idPubInStorage);
        }
    }

    private void displayPublication(String idPublication) {

        try {

            Integer idPubInStorage = Integer.valueOf(idPublication);

            displayFromStorage(idPubInStorage);

        } catch (NumberFormatException n) {

            System.out.println(INCORRECT_COMMAND + idPublication);
        }

    }

    @Override
    public void execute() {

        System.out.println(INPUT_ID_PUB_FOR_SHOW);

        System.out.println(FOR_RETURN_MENU);

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) { //Waiting input

            String userInput = scanner.next();

            if (RETURN_MENU_CODE.equals(userInput)) {

                isRunning = false;

                new MenuPublication().execute();

            } else {

                displayPublication(userInput);
            }

        }
    }
}
