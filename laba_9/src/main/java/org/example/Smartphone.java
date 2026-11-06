package org.example;

public class Smartphone extends Device {
    private int cameraMP;

    public Smartphone(String model, int power, boolean isOn, int cameraMP) {
        super(model, power, isOn);
        this.cameraMP = cameraMP;
    }

    public int getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(int cameraMP) {
        this.cameraMP = cameraMP;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Смартфон загружается");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Смартфон выключается");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип устройства: Смартфон, Камера: " + cameraMP + " МП");
    }
}
