package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Building[] buildings = new Building[5];

        buildings[0] = new Residential("ул. Ленина, д. 12", 9, 4500.0, 72);
        buildings[1] = new Residential("пр. Независимости, д. 85", 16, 9200.0, 128);
        buildings[2] = new Residential("ул. Советская, д. 4", 5, 2100.0, 30);
        buildings[3] = new Office("ул. Кирова, д. 100", 12, 6800.0, 24);
        buildings[4] = new Office("пр. Победителей, д. 20", 22, 15000.0, 50);

        System.out.println("Информация о зданиях:");
        for (Building b : buildings) {
            b.displayInfo();
            System.out.println();
        }

        System.out.println("Уникальные методы:");
        for (int i = 0; i < buildings.length; i++) {
            Building b = buildings[i];
            System.out.print("Объект №" + (i + 1) + " (" + b.getAddress() + "): ");

            if (b instanceof Residential) {
                Residential res = (Residential) b;
                System.out.println("Средняя стоимость квартиры: " + res.getApartmentPrice());
            } else if (b instanceof Office) {
                Office off = (Office) b;
                System.out.println("Общая стоимость аренды в месяц: " +off.getRentPrice());
            }
        }
    }
}
