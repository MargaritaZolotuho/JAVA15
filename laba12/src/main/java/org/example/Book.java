package org.example;

public class Book {
    protected String title;
    protected int id;
    protected int pages;

    public Book(String title, int id, int pages) {
        this.title = title;
        this.id = id;
        this.pages = pages;
    }

    public String getTitle() { return title; }

    public String toString() {
        return "Book{title='" + title + "', id=" + id + ", pages=" + pages + "}";
    }
}