package com.github.assenovabay.librarystock.run;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.command.impl.MenuPublication;

/**
 * @author Abay Assenov
 *         10/9/2017
 */
public class App {

    public static void main(String[] args) {

        Action menu = new MenuPublication();
        menu.execute();

    }
}
