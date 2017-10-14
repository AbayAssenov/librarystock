package com.github.assenovabay.librarystock.storage.impl;

import com.github.assenovabay.librarystock.entity.Publication;
import com.github.assenovabay.librarystock.storage.Storage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abay Assenov
 *         10/10/2017
 * */

public enum  ArrayStorage implements Storage<Publication> {

    INSTANCE; //Singleton

    private static List<Publication> publicationList = new ArrayList<>();

    @Override
    public void create(Publication publication) {

        publicationList.add(publication);
    }

    @Override
    public Publication read(int idPublication) throws IndexOutOfBoundsException{

        return publicationList.get(idPublication);
    }

    public List<Publication> readAll(){

        return new ArrayList<>(publicationList);
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
