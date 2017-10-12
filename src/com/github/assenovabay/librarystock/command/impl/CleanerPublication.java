package com.github.assenovabay.librarystock.command.impl;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.storage.impl.ArrayStorage;

import java.util.Scanner;

/**
 * @author Abay Assenov
 *         10/12/2017
 */
public class CleanerPublication implements Action {

    private void removePublication(String idPublication) {


        try {
            int idPubInStorage = Integer.valueOf(idPublication);

            try {

                ArrayStorage.INSTANCE.delete(idPubInStorage);

                System.out.println("Удаленна запись с идентификатором " + idPublication);

            } catch (IndexOutOfBoundsException i) {

                System.out.println("Нет записи с идентификатором-> " + idPublication);
            }

        } catch (NumberFormatException n) {

            System.out.println("Некоректное число-> " + idPublication);
        }

    }

    @Override
    public void execute() {

        System.out.println("Введите id издания для удаления");
        System.out.println("\nДля возврата в меню введите команду: \"00\"  ");


        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (isRunning) { //Waiting input

            String userInput = scanner.next();

            if ("00".equals(userInput)) {

                isRunning = false;

                new MenuPublication().execute();

            } else {

                removePublication(userInput);
            }

        }
    }
}