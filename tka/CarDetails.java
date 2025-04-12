// Calling Car Class here by creating Object in CarDetails Class


package com.tka;

public class CarDetails {
    public static void main(String[] args)
    {
        Car c = new Car(23567, "Fortuner", "Black", 2014, "Tejas");
        c.carInfo();
        System.out.println("--------------------------");
        c.findCarAge(2025);
        System.out.println("--------------------------");
        Car c1 = new Car(21234, "BMW", "Black", 2016, "Jay");
        c1.carInfo();

    }
}
