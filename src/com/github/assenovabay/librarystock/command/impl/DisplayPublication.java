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

    private void print(Publication publication) {

        System.out.println(SEPARATOR);

        switch (publication.getType()) { //Show header

            case BOOK:
                System.out.printf(FORMAT_BOOK_BODY, ID, AUTHOR, LABEL, RELASE_DATA,
                        COUNT_PAGE,PUBLISHER, GENRE, DESCRIPTION);
                break;

            case BOOKLET:
                System.out.printf(FORMAT_BOOKLET_BODY, ID, LABEL, RELASE_DATA, PUBLISHER, DESCRIPTION);
                break;

            case MAGAZINE:
                System.out.printf(FORMAT_MAGAZINE_BODY, ID, LABEL, RELASE_DATA, COUNT_PAGE, PUBLISHER,
                        DESCRIPTION);
                break;
        }

        System.out.println(SEPARATOR);

        System.out.println(publication.getAllInfo()); //Show body result

    }

    private void displayPublication(String idPublication) {

        try {

            Integer idPubInStorage = Integer.valueOf(idPublication);

            try {

                Publication currentPublication = ArrayStorage.INSTANCE.read(idPubInStorage);

                currentPublication.setIdStorage(idPubInStorage); //Set id publication from array (index)

                print(currentPublication); // Print info

            } catch (IndexOutOfBoundsException i) {

                System.out.println(HAVE_NOT_PUB + idPubInStorage);
            }

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

            String userInput = scanner.nextLine();

            if (RETURN_MENU_CODE.equals(userInput)) {

                isRunning = false;

                new MenuPublication().execute();

            } else {

                displayPublication(userInput);
            }

        }
    }
}
