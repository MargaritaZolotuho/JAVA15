package org.example;

public class Textbook extends Book {

    public Textbook(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String getGenre() {
        return "Учебник";
    }
}
