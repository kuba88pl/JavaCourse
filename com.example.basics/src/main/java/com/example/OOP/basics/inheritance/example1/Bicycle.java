package com.example.OOP.basics.inheritance.example1;

public class Bicycle extends Vehicle{
    Bicycle() {

        // super(); dodane automatycznie
        type = "Bicycle";
        manufacturer = "Romet";
        topSpeed = 15.0f;
    }
}
