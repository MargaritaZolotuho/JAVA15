package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void printAthletes(List<Athlete> athletes, int targetLevel) {
        System.out.println("\nСпортсмены на уровне " + targetLevel + " ---");
        for (Athlete a : athletes) {
            if (a.getLevel() == targetLevel) {
                System.out.println("ID: " + a.getId() + ", Имя: " + a.getName() + ", Вид спорта: " + a.getSport() + ", Уровень: " + a.getLevel());
            }
        }
    }
    public static void main( String[] args )
    {
        Map<String, Book> bookMap = new HashMap<>();

        bookMap.put("1984", new Novel("1984", 1, 328, "Антиутопия"));
        bookMap.put("Мастер и Маргарита", new Novel("Мастер и Маргарита", 2, 450, "Мистика"));
        bookMap.put("Грозовой перевал", new Novel("Грозовой перевал", 3, 280, "Романтика"));


        bookMap.put("Алгебра 10", new Textbook("Алгебра 10", 4, 250, "Математика"));
        bookMap.put("Физика 11", new Textbook("Физика 11", 5, 300, "Физика"));
        bookMap.put("История", new Textbook("История", 6, 220, "Гуманитарные науки"));


        bookMap.put("Batman", new Comic("Batman", 7, 120, "Bob Kane"));
        bookMap.put("Spider-Man", new Comic("Spider-Man", 8, 110, "Steve Ditko"));


        System.out.println("СОДЕРЖИМОЕ КНИГ");
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " | Значение: " + entry.getValue());
        }



        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(1, "Алексей Иванов", "Футбол", 2, Arrays.asList(5, 4, 5, 4)));
        athletes.add(new Athlete(2, "Иван Петров", "Хоккей", 1, Arrays.asList(2, 3, 2)));
        athletes.add(new Athlete(3, "Дмитрий Смирнов", "Плавание", 3, Arrays.asList(4, 5, 4, 5)));
        athletes.add(new Athlete(4, "Сергей Васильев", "Теннис", 2, Arrays.asList(3, 3, 3, 3)));
        athletes.add(new Athlete(5, "Андрей Кузнецов", "Легкая атлетика", 4, Arrays.asList(5, 5, 5)));


        athletes.removeIf(a -> a.getAverageResult() < 3.0);


        for (Athlete a : athletes) {
            if (a.getAverageResult() >= 4.0) {
                a.setLevel(a.getLevel() + 1);
            }
        }

        printAthletes(athletes, 3);

        athletes.sort((a1, a2) -> {
            int comp = Double.compare(a2.getAverageResult(), a1.getAverageResult());
            if (comp != 0) {
                return comp;
            }
            return a2.getName().compareTo(a1.getName());
        });

        System.out.println("\nОтсортированный список спортсменов:");
        for (Athlete a : athletes) {
            System.out.println("ID: " + a.getId() + " Имя: " + a.getName() + " Средний результат: " + a.getAverageResult());
        }
    }
}

