package com.example.OOP.basics;

import java.sql.SQLOutput;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car() {
        this.manufacturer = "Unknow";
    }

    public Car(String manufacturer, String name, String color, int year, float topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.color = color;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public void printInfo() {
        System.out.println(
                this.manufacturer + " " +
                        this.name + " " +
                        this.color + " " +
                        this.year + " " +
                        this.topSpeed
        );
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "ford";
        ford.name = "mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;

        Car chevrolet = new Car();
        chevrolet.manufacturer = "chevrolet";
        chevrolet.name = "camaro";
        chevrolet.color = "black";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;

        ford.printInfo();
        chevrolet.printInfo();

        Car dodge = new Car("Dodge", "Viper", "blue", 1998, 200.0f);

        dodge.printInfo();

    }
}
