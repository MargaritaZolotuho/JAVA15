package org.example;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Создать файл с информацией о своём хобби, вывести данные и содержимое");
        System.out.println("2. Ввести в файл 'f' 10 целых чисел, вывести их и найти количество чётных");
        System.out.println("3. Создать файл 'f' со случайными числами: в 'g' — кратные 4, в 'h' — остальные");
        System.out.println("4. Ввести в файл 12 вещественных значений освещённости, вывести среднюю");
        System.out.println("5. Создать текстовый файл 'f' с 10 целыми числами и вывести количество нечётных");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Задание 1");
                task1();
                break;
            case 2:
                System.out.println("\nЗадание 2");
                task2();
                break;
            case 3:
                System.out.println("\nЗадание 3");
                task3();
                break;
            case 4:
                System.out.println("\nЗадание 4");
                task4();
                break;
            case 5:
                System.out.println("\nЗадание 5");
                task5();
                break;
            default:
                System.out.println("Ошибка: введено неверное значение! Выберите число от 1 до 5.");
        }

        scanner.close();
    }

    public static void task1() {
        String fileName = "hobby.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Мое хобби это просмотр фильмов.");
            System.out.println("Файл с информацией о хобби успешно создан.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(fileName);
        System.out.println("\nСвойства файла:");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер файла: " + file.length() + " байт");
        System.out.println("Файл существует: " + file.exists());


        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task2() {
        String fileName = "f.txt";
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                writer.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nЧисла из файла 'f':");
        int evenCount = 0;
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num % 2 == 0) {
                    evenCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nКоличество чётных чисел: " + evenCount);
    }

    public static void task3() {
        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";
        Random random = new Random();


        try (PrintWriter writer = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < 15; i++) {
                writer.println(random.nextInt(100));
            }
            System.out.println("Файл 'f' со случайными числами успешно создан.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new File(fileF));
             PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
             PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 4 == 0) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
            System.out.println("Числа успешно распределены по файлам 'g' (кратные 4) и 'h' (остальные)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void task4() {
        String fileName = "illumination.txt";
        Scanner scanner = new Scanner(System.in);


        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 12 вещественных значений освещённости:");
            for (int i = 0; i < 12; i++) {
                double val = scanner.nextDouble();
                writer.println(val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (count > 0) {
            System.out.println("Средняя освещённость: " + (sum / count));
        } else {
            System.out.println("Файл пуст.");
        }
    }

    public static void task5() {
        String fileName = "f.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(3);
            writer.println(8);
            writer.println(15);
            writer.println(22);
            writer.println(7);
            writer.println(10);
            writer.println(13);
            writer.println(4);
            writer.println(9);
            writer.println(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int oddCount = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 2 != 0) {
                    oddCount++;
                }
            }
            System.out.println("Количество нечётных значений в файле 'f': " + oddCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}