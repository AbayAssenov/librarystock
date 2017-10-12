package com.github.assenovabay.librarystock.storage;

/**
 * @author Abay Assenov
 *         10/9/2017
 */

public interface Storage<T> {

    void create(T entity);

    T read(int idEntity);

    void update(T entity);

    void delete(int idEntity);

}
