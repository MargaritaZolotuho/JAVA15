package org.example;

public class Apartment {
     private String address;
     private int rooms;
     private double area;

     public static int totalApartments = 0;
    public static double totalArea = 0.0;

    public Apartment( String address, int rooms,double area){
        this.address= address;
        this.rooms=rooms;
        this.area = area;

        totalApartments++;
        totalArea+=area;

    }

    public String getAddress(){
        return address;
    }

    public int getRooms(){
        return rooms;
    }

    public double gerAreea(){
        return area;
    }

    public static double getAverageArea(){
        if (totalApartments == 0) {
            return 0.0;
        }
        return totalArea / totalApartments;
    }

    public String toString(){
        return "Адрес: "+address +"| Комнат: " + rooms+ "| Площадь: "+ area;
    }








}
