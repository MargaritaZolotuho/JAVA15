package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book genericBook = new Book("Простая книга", "Неизвестен", 150);
        Novel novel = new Novel("Мастер и Маргарита", "М. Булгаков", 480);
        Textbook textbook = new Textbook("Алгебра 10 класс", "Колмогоров", 250);

        genericBook.read();
        genericBook.read(50);
        genericBook.read("Глава 3");

        Book book1 = new Novel("1984", "Джордж Оруэлл", 320);
        book1.displayInfo();

        System.out.println();

        Book book2 = new Textbook("Физика 11", "Мякишев", 300);
        book2.displayInfo();

        if (book1 instanceof Novel) {
            System.out.println("book1 — роман");
        }

    }
}
