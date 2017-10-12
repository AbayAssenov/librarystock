package com.github.assenovabay.librarystock.entity;


import java.util.Objects;

/**
 * @author Abay Assenov
 *         10/9/2017
 */
public abstract class Publication {

    private String name;
    private String year;
    private String publisher;
    private String description;
    private int idStorage;

    public int getIdStorage() {
        return idStorage;
    }

    public void setIdStorage(int idStorage) {
        this.idStorage = idStorage;
    }

    public abstract String getType();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;
        Publication that = (Publication) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getYear(), that.getYear()) &&
                Objects.equals(getPublisher(), that.getPublisher()) &&
                Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getPublisher(), getDescription());
    }
}
