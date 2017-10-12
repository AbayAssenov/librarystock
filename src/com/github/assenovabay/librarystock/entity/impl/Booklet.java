package com.github.assenovabay.librarystock.entity.impl;

import com.github.assenovabay.librarystock.constant.LibraryConstatnt;
import com.github.assenovabay.librarystock.entity.Publication;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.EMPTY;
import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.FORMAT_REGISTERED_PUB_BODY;

/**
 * @author Abay Assenov
 *         10/9/2017
 */
public class Booklet extends Publication {

    private String month;

    @Override
    public String getType() {

        return LibraryConstatnt.BOOKLET;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return String.format(FORMAT_REGISTERED_PUB_BODY, getIdStorage(), getType(), getName(), getMonth() + getYear(), EMPTY, getPublisher());

    }

}
