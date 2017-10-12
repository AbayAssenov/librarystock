package com.github.assenovabay.librarystock.run;

import com.github.assenovabay.librarystock.command.Action;
import com.github.assenovabay.librarystock.command.impl.MenuPublication;
import com.github.assenovabay.librarystock.storage.impl.ArrayStorage;

/**
 * @author Abay Assenov
 *         10/9/2017
 */
public class App {

    public static void main(String[] args) {

        ArrayStorage.INSTANCE.init();

//        CreatorPublication creator=new CreatorPublication();
//        creator.execute();


//        RegisteredPublication r=new RegisteredPublication();
//        r.execute();

        Action menu=new MenuPublication();
        menu.execute();

    }
}
