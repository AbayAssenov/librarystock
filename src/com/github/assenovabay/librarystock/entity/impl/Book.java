package com.github.assenovabay.librarystock.entity.impl;

import com.github.assenovabay.librarystock.constant.LibraryConstatnt;
import com.github.assenovabay.librarystock.entity.Publication;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.FORMAT_REGISTERED_PUB_BODY;

/**
 * @author Abay Assenov
 *         10/9/2017
 */
public class Book extends Publication {

    private String author;
    private int countPage;
    private String janr;

    @Override
    public String getType() {

        return LibraryConstatnt.BOOK;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getJanr() {
        return janr;
    }

    public void setGenre(String janr) {
        this.janr = janr;
    }

    @Override
    public String toString() {
        return String.format(FORMAT_REGISTERED_PUB_BODY,getIdStorage(),getType(),getName(),getYear(),getCountPage(),getPublisher());
    }


}
