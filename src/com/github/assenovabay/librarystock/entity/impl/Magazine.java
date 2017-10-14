package com.github.assenovabay.librarystock.entity.impl;


import com.github.assenovabay.librarystock.constant.LibraryConstatnt;
import com.github.assenovabay.librarystock.entity.Publication;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.FORMAT_MAGAZINE_BODY;
import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.FORMAT_REGISTERED_PUB_BODY;

/**
 * @author Abay Assenov
 *         10/9/2017
 */
public class Magazine extends Publication {

    private String month;
    private int countPage;


    @Override
    public String getType() {

        return LibraryConstatnt.MAGAZINE;
    }

    public String getAllInfo() {

        return String.format(FORMAT_MAGAZINE_BODY,getIdStorage(),
                getName(),getMonth()+getYear(),getCountPage(),getPublisher(),getDescription());
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    @Override
    public String toString() {
        return String.format(FORMAT_REGISTERED_PUB_BODY, getIdStorage(), getType(), getName(), getMonth() + getYear(), getCountPage(), getPublisher());
    }

}
