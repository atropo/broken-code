package it.tbg.app.models;

public class Book {
    public String title;
    public int year;
    public int pages;
    public Type type;

    public Book(String title, int year, int pages, Type type) {
        this.title = title;
        this.year = year;
        this.pages = pages;
        this.type = type;
    }

    public enum Type{
        FICTION,
        COLLECTION,
        NON_FICTION
    }
}

