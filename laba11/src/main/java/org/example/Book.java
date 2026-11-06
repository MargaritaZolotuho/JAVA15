package org.example;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void read() {
        System.out.println("Читаю книгу \"" + title + "\"");
    }

    public void read(int pagesToRead) {
        System.out.println("Читаю " + pagesToRead + " страниц книги \"" + title + "\"");
    }

    public void read(String chapter) {
        System.out.println("Читаю главу \"" + chapter + "\" в книге \"" + title + "\"");
    }


    public String getGenre() {
        return "Неизвестный жанр";
    }

    public void displayInfo() {
        System.out.println("Книга: \"" + title + "\", Автор: " + author + ", Страниц: " + pages + ", Жанр: " + getGenre());
    }
}
