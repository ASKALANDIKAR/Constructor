// DEMO-2
// Constructor With Method and it's Code-->


package com.tka;
public class Car {
    int carNo;
    String carName;
    String carCLR; // Car Color
    int carModelYR; // Model Year
    String carOwner;


    public Car(int carNo, String carName, String carCLR, int carModelYR, String carOwner)
    {
        this.carNo = carNo;
        this.carName = carName;
        this.carCLR = carCLR;
        this.carModelYR = carModelYR;
        this.carOwner = carOwner;
    }

    public void carInfo()
    {
        System.out.println("Car Informations...");
        System.out.println("---------------------");

        System.out.println("CarNO = " + this.carNo);
        System.out.println("Car Name = " + this.carName);
        System.out.println("Car CLR = " + this.carCLR);
        System.out.println("Car Model = " + this.carModelYR);
        System.out.println("Car Owner Name =  " + this.carOwner);
    }

    public void findCarAge(int currentYR)
    {
        int yr = currentYR - this.carModelYR;
        System.out.println("Age OF the Car is " + yr);
    }




}
