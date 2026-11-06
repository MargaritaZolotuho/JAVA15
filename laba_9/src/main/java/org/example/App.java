package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Device[] devices = new Device[5];

        devices[0] = new Smartphone("iPhone 15", 20, false, 48);
        devices[1] = new Smartphone("Samsung Galaxy S24", 25, false, 50);
        devices[2] = new Smartphone("Xiaomi 14", 22, false, 32);

        devices[3] = new Laptop("MacBook Pro", 65, false, 14.2);
        devices[4] = new Laptop("ASUS ROG Strix", 180, false, 17.3);



        for (Device dev : devices) {
            System.out.println(" ");
            dev.displayInfo();
            dev.turnOn();
            dev.turnOff();
        }

        Device d1 = new Laptop("Sumsung",170,true, 23.7);
    }
}
