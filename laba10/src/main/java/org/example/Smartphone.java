package org.example;

public class Smartphone implements Chargeable, Switchable{
    private String model;
    private int battery;
    private boolean on;

    public Smartphone(String model, int battery, boolean on) {
        this.model = model;
        this.battery = battery;
        this.on = on;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Смартфон " + model + " включен.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Смартфон " + model + " выключен.");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void charge() {
        battery = 100;
        System.out.println("Смартфон " + model + " заряжен до 100%.");
    }

    @Override
    public int getBatteryLevel() {
        return battery;
    }

    public void displayInfo() {
        System.out.println("Смартфон Модель: " + model + ", Батарея: " + battery + "%, Статус: " + (on ? "Включен" : "Выключен") );
    }

}
