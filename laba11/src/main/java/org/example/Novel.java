package org.example;

public class Novel extends Book {

    public Novel(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String getGenre() {
        return "Роман";
    }
}
