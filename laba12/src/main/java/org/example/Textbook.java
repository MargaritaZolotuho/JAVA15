package org.example;

public class Textbook extends Book {
    private String subject;

    public Textbook(String title, int id, int pages, String subject) {
        super(title, id, pages);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Textbook{title='" + title + "', id=" + id + ", pages=" + pages + ", subject='" + subject + "'}";
    }
}
