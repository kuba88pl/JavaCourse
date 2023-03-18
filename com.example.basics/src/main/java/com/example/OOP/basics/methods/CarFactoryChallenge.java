package com.example.OOP.basics.methods;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Random;

class Car {
    String model = "Mustang";
    String brand = "Ford";
    String color;

    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public Car() {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }


    public String getColor() {
        this.color = color;
        System.out.println(color);
        return color;
    }

    public void printInfo() {

        System.out.println(this.model + " " + this.brand + " " + this.color);
    }
}

class CarFactory {
    String[] colors = {"red", "black", "white"};
    public Car buildCar() {
        Random random = new Random();
        int r = random.nextInt(colors.length);
        Car mustang = new Car("Mustang", "Ford", colors[r]);
        System.out.println(mustang.brand + " " + mustang.model + " " + mustang.color);
        return mustang;


    }
}


public class CarFactoryChallenge {
    public static void main(String[] args) {


        CarFactory carFactory = new CarFactory();
        carFactory.buildCar();
        carFactory.buildCar();
        Car car1 = carFactory.buildCar();
        car1.printInfo();
        car1.getColor();



    }
}
