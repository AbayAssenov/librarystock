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


    private void displayPublication(String idPublication) {


        try {
            int idPubInStorage = Integer.valueOf(idPublication);

            try{

                Publication currentPublication = ArrayStorage.INSTANCE.read(idPubInStorage);

                currentPublication.setIdStorage(idPubInStorage);

                System.out.printf(FORMAT_REGISTERED_PUB_BODY, ID, TYPE, LABEL, RELASE_DATA, COUNT_PAGE, PUBLISHER);

                System.out.println(currentPublication);

            }catch (IndexOutOfBoundsException i){

                System.out.println("Нет записи с идентификатором-> " + idPublication);
            }

        } catch (NumberFormatException n) {

            System.out.println("Некоректное число-> " + idPublication);
        }

    }

    @Override
    public void execute() {

        System.out.println("Введите id издания для просмотра");
        System.out.println("\nДля возврата в меню введите команду: \"00\"  ");


        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (isRunning) { //Waiting input

            String userInput=scanner.next();

            if("00".equals(userInput)){

                isRunning = false;

                new MenuPublication().execute();

            }else {

                displayPublication(userInput);
            }

        }
    }
}
