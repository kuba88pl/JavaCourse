package com.example.OOP.basics.inheritance.example1;

public class Vehicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle () {
        type = "Unknown";
        manufacturer = " Unknown";
        topSpeed = 0.0f;
    }

    public void printInfo(){
        System.out.println("Type: " + type + " " +
                "Manufacturer: " + manufacturer + " " +
                "topSpeed: " + topSpeed);
    }
}
