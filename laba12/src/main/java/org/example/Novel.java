package org.example;

public class Novel extends Book {
    private String genre;

    public Novel(String title, int id, int pages, String genre) {
        super(title, id, pages);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Novel{title='" + title + "', id=" + id + ", pages=" + pages + ", genre='" + genre + "'}";
    }
}
