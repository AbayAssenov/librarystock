package com.github.assenovabay.librarystock.command.impl;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.storage.impl.ArrayStorage;

import java.util.Scanner;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.*;

/**
 * @author Abay Assenov
 *         10/12/2017
 */
public class CleanerPublication implements Action {


    /**
     * Checks to index and removing
     */
    private void removeFromStorage(int idPubInStorage) {

        try { //Checking for index

            ArrayStorage.INSTANCE.delete(idPubInStorage);

            System.out.println(DELETED_PUB + idPubInStorage);

        } catch (IndexOutOfBoundsException i) {

            System.out.println(HAVE_NOT_PUB + idPubInStorage);
        }
    }

    /**
     * Checks to number type and call remove method by id from storage
     */
    private void removePublication(String idPublication) {

        try { //Checking for number

            int idPubInStorage = Integer.valueOf(idPublication);

            removeFromStorage(idPubInStorage);

        } catch (NumberFormatException n) {

            System.out.println(INCORRECT_NUMBER + idPublication);
        }

    }

    @Override
    public void execute() {

        System.out.println(INPUT_ID_PUB_FOR_DELET);

        System.out.println(FOR_RETURN_MENU);

        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (isRunning) { //Waiting input

            String userInput = scanner.nextLine();

            if (RETURN_MENU_CODE.equals(userInput)) { //Checking return to menu

                isRunning = false;

                new MenuPublication().execute();

            } else {

                removePublication(userInput);
            }

        }
    }
}