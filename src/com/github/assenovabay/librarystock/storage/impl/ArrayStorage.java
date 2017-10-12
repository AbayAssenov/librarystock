package com.github.assenovabay.librarystock.storage.impl;

import com.github.assenovabay.librarystock.entity.Publication;
import com.github.assenovabay.librarystock.entity.impl.Book;
import com.github.assenovabay.librarystock.entity.impl.Booklet;
import com.github.assenovabay.librarystock.entity.impl.Magazine;
import com.github.assenovabay.librarystock.storage.Storage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abay Assenov
 *         10/10/2017
 *
 */

public enum  ArrayStorage implements Storage<Publication> {

    INSTANCE; //Singleton

    private static List<Publication> publicationList = new ArrayList<Publication>();


    public void init(){

        Booklet booklet2=new Booklet();
        booklet2.setMonth("January");
        booklet2.setDescription("How to create new world?");
        booklet2.setName("I can");
        booklet2.setPublisher("Really");
        booklet2.setYear("2017");

        Book book1=new Book();
        book1.setAuthor("Bloh D.");
        book1.setCountPage(550);
        book1.setGenre("Detective");
        book1.setDescription("Very useful book for young programmers");
        book1.setName("Java Effective");
        book1.setYear("2014");
        book1.setPublisher("Moscow");

        Booklet booklet1=new Booklet();
        booklet1.setMonth("January");
        booklet1.setDescription("How to create new world?");
        booklet1.setName("I can");
        booklet1.setPublisher("Really");
        booklet1.setYear("2017");

        Magazine magazine1=new Magazine();
        magazine1.setCountPage(15);
        magazine1.setMonth("Декабрь");
        magazine1.setDescription("Истории факты не правды и прочее");
        magazine1.setName("Чио-Рио");
        magazine1.setPublisher("Sidney Stor");
        magazine1.setYear("1999");



        publicationList.add(booklet2);
        publicationList.add(magazine1);
        publicationList.add(booklet1);
        publicationList.add(book1);
        publicationList.add(booklet2);
        publicationList.add(magazine1);
        publicationList.add(booklet2);
        publicationList.add(magazine1);
        publicationList.add(booklet1);
        publicationList.add(book1);
        publicationList.add(booklet2);
        publicationList.add(magazine1);
    }

    @Override
    public void create(Publication publication) {

        publicationList.add(publication);
    }

    @Override
    public Publication read(int idPublication) throws IndexOutOfBoundsException{

        return publicationList.get(idPublication);
    }

    public List<Publication> readAll(){

        List<Publication> tempList=new ArrayList<Publication>(publicationList);

        return tempList;
    }

    @Override
    public void update(Publication publication) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(int idPublication) {

        publicationList.remove(idPublication);
    }
}
