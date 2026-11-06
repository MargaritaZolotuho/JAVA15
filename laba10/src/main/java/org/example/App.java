package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Smartphone phone1 = new Smartphone("iPhone 15", 35, false);
        Smartphone phone2 = new Smartphone("Samsung Galaxy S24", 20, false);
        Smartphone phone3 = new Smartphone("Xiaomi 14", 10, false);

        Laptop laptop1 = new Laptop("MacBook Pro", 45, false, 14.2);
        Laptop laptop2 = new Laptop("ASUS ROG Strix", 15, false, 17.3);


        phone1.displayInfo();
        phone1.turnOn();
        System.out.println("Заряд до: " + phone1.getBatteryLevel() + "%");
        phone1.charge();


        phone2.displayInfo();
        phone2.turnOn();
        System.out.println("Заряд до: " + phone2.getBatteryLevel() + "%");
        phone2.charge();

        phone3.displayInfo();
        phone3.turnOn();
        System.out.println("Заряд до: " + phone3.getBatteryLevel() + "%");
        phone3.charge();

        laptop1.displayInfo();
        laptop1.turnOn();
        System.out.println("Заряд до: " + laptop1.getBatteryLevel() + "%");
        laptop1.charge();

        laptop2.displayInfo();
        laptop2.turnOn();
        System.out.println("Заряд до : " + laptop2.getBatteryLevel() + "%");
        laptop2.charge();
    }
}
