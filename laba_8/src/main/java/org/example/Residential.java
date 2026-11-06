package org.example;

public class Residential extends Building{
    private int apartments;

    public Residential(String address, int floors, double area, int apartments) {
        super(address, floors, area);
        this.apartments = apartments;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    public String getPurpose() {
        return "Жилой дом";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Квартир: " + apartments + ", Средняя площадь квартиры: " +  getArea() / apartments);
    }

    public double getApartmentPrice() {
        double pricePerSqMeter = 1700.0;
        double avgApartmentArea = getArea() / apartments;
        return avgApartmentArea * pricePerSqMeter;
    }

}
