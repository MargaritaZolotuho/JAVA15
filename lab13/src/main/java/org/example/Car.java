package org.example;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private double price;

    public Car(String brand, String model, int year, int mileage, double price) throws InvalidCarDataException {
        this.brand = brand;
        this.model = model;
        setYear(this.year);
        setMileage(this.mileage);
        setPrice(this.price);
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }

    public void setYear(int year)throws InvalidCarDataException{
        if (year < 1900 || year > 2025)  {
            throw new InvalidCarDataException("Ошибка: Некорректный год выпуска (" + year + "). Допустимо от 1900 до 2025.");
        }
        this.year=year;
    }

    public void setMileage(int mileage) throws InvalidCarDataException{
        if (mileage < 0) {
            throw new InvalidCarDataException("Ошибка: Пробег не может быть отрицательным (" + mileage + ").");
        }
        this.mileage = mileage;
    }

    public void setPrice(double price) throws InvalidCarDataException {
        if (price <= 0) {
            throw new InvalidCarDataException("Ошибка: Цена должна быть больше нуля (" + price + ").");
        }
        this.price=price;

    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String model){
        this.model=model;
    }


    public void updatePrice(double newPrice) throws PriceUpdateException {
        if (newPrice <= 0) {
            throw new PriceUpdateException("Невозможно обновить цену: новая цена (" + newPrice + ") должна быть больше 0.");
        }
        this.price = newPrice;
        System.out.println("Цена автомобиля " + brand + " " + model + " успешно обновлена до: " + newPrice + " руб.");
    }

    public void addMileage(int km) throws InvalidCarDataException {
        if (km < 0) {
            throw new InvalidCarDataException("Нельзя добавить отрицательный пробег (" + km + ").");
        }
        this.mileage += km;
        System.out.println("Пробег автомобиля " + brand + " " + model + " увеличен на " + km + " км. Общий пробег: " + mileage + " км.");
    }

    @Override
    public String toString() {
        return "Car [Марка: " + brand + ", Модель: " + model + ", Год: " + year + ", Пробег: " + mileage + " км, Цена: " + price + " руб.]";
    }
}
