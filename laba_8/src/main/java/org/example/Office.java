package org.example;

public class Office extends Building{
    private int companies;

    public Office(String address, int floors, double area, int companies) {
        super(address, floors, area);
        this.companies = companies;
    }

    public int getCompanies() {
        return companies;
    }

    public void setCompanies(int companies) {
        this.companies = companies;
    }

    public String getPurpose() {
        return "Офисное здание";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Компаний: " + companies + ", Средняя площадь на компанию: " + getArea() / companies);
    }

    public double getRentPrice() {
        double rentRatePerSqMeter = 15.0;
        return getArea() * rentRatePerSqMeter;
    }
}
