package org.example;

public class Comic extends Book {
    private String illustrator;

    public Comic(String title, int id, int pages, String illustrator) {
        super(title, id, pages);
        this.illustrator = illustrator;
    }

    @Override
    public String toString() {
        return "Comic{title='" + title + "', id=" + id + ", pages=" + pages + ", illustrator='" + illustrator + "'}";
    }
}