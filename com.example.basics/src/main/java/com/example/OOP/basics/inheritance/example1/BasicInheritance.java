package com.example.OOP.basics.inheritance.example1;

public class BasicInheritance {
    public static void main(String[] args) {


        Vehicle vehicle1 = new Vehicle();
        vehicle1.printInfo();

        Car car = new Car();
        car.printInfo();
        Car car2 = new Car("Ford", 300 );
        car2.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();
        SuperCar superCar = new SuperCar();
        superCar.printInfo();
        superCar.setSportMode();


    }
}
