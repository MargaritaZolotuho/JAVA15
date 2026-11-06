package org.example;

public class Laptop implements Switchable, Chargeable {
    private String model;
    private int battery;
    private boolean on;
    private double screenSize;

    public Laptop( String model, int battery, boolean on, double screenSize){
    this.model=model;
    this.battery=battery;
    this.on=on;
    this.screenSize=screenSize;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public double getScreenSize(){
        return screenSize;
    }

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn(){
        on=true;
        System.out.println("Ноутбук " + model + " включен.");
    }

    public void turnOff() {
        on = false;
        System.out.println("Ноутбук " + model + " выключен.");

    }

    public boolean isOn(){
        return on;
    }


    @Override
    public void charge() {
        battery = 100;
        System.out.println("Ноутбук" + model + " заряжен до 100%.");
    }

    @Override
    public int getBatteryLevel() {
        return battery;
    }

    public void displayInfo() {
        System.out.println("Ноутбук Модель: " + model + ", Батарея: " + battery + "%, Размер экрана" + screenSize+ ", Статус: " + (on ? "Включен" : "Выключен") );
    }



}
