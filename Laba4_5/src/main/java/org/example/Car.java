package org.example;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;

    public Car(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void drive(int km) {
        if (km > 0) {
            this.mileage += km;
        }
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Год: " + year + ", Пробег: " + mileage + " км");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A4", 2021, 45000);
        System.out.println("Начальное состояние:");
        car1.displayInfo();

        car1.drive(100);

        System.out.println("\nПосле поездки на 100 км:");
        car1.displayInfo();
    }
}