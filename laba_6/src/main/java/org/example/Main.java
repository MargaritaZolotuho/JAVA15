package org.example;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game("The Witcher 3", "RPG", 10);
        Game game2 = new Game("Cyberpunk 2077", "Action RPG", 8);
        System.out.println("Название: " + game1.GetTitle());
        System.out.println("Жанр: " + game1.GetGenre());
        System.out.println("Рейтинг: " + game1.GetRating());
        System.out.println("Входит в топ: " + (game1.isTop() ? "Да" : "Нет"));
        System.out.println("Название: " + game2.GetTitle());
        System.out.println("Жанр: " + game2.GetGenre());
        System.out.println("Рейтинг: " + game2.GetRating());
        System.out.println("Входит в топ: " + (game2.isTop() ? "Да" : "Нет"));
    }
}