package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Apartment apt1 = new Apartment("ул. Ленина, д. 10, кв. 15", 2, 45.5);
        Apartment apt2 = new Apartment("пр. Независимости, д. 45, кв. 82", 3, 72.0);
        Apartment apt3 = new Apartment("ул. Советская, д. 12, кв. 4", 1, 33.8);
        Apartment apt4 = new Apartment("ул. Мира, д. 5, кв. 21", 4, 105.2);

        System.out.println("Список квартир:");
        System.out.println(apt1);
        System.out.println(apt2);
        System.out.println(apt3);
        System.out.println(apt4);

        System.out.println("Общая статистика:");
        System.out.println("Всего квартир: " + Apartment.totalApartments);
        System.out.println("Общая площадь всех квартир:" + Apartment.totalArea);
        System.out.println("Средняя площадь квартиры: " + Apartment.getAverageArea());

    }

}
