package org.example;
import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Car> showroom = new ArrayList<>();

        try {
            showroom.add(new Car("Toyota", "Camry", 2020, 45000, 25000.0));
            showroom.add(new Car("BMW", "X5", 2022, 15000, 60000.0));
            showroom.add(new Car("LandRover", "RangeRover",2080,10000,3500.0));
        }
        catch (InvalidCarDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            Car invalidCar = new Car("DeLorean", "DMC-12", 2030, 0, 50000.0);
            showroom.add(invalidCar);
        } catch (InvalidCarDataException e) {
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            if (showroom.isEmpty()) {
                throw new CarNotFoundException("В автосалоне нет доступных автомобилей");
            }

            Car targetCar = showroom.get(0);
            System.out.println("Авто: " + targetCar);

            targetCar.addMileage(500);

            targetCar.updatePrice(24000.0);

            targetCar.updatePrice(-1000.0);

        }
        catch (CarNotFoundException | PriceUpdateException | InvalidCarDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Операция с автосалоном завершена.\n");
        }

        System.out.println("Итоговый список машин в автосалоне");
        for (Car c : showroom) {
            System.out.println(c);
        }
    }
}
