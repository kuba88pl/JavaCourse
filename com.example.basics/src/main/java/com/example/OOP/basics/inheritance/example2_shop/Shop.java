package com.example.OOP.basics.inheritance.example2_shop;

import java.security.Key;

public class Shop {
    public static void main(String[] args) {


            Monitor nec = new Monitor();
        System.out.println(nec.resolution);
        Computer computer1 = new Computer();
        computer1.price = 5000.0;
        computer1.monitor = true;
        computer1.keyboard = true;
        computer1.mouse = true;
        computer1.manufacturer = "Samsung";
        computer1.productionYear = 2023;

        Keyboard keyboard = new Keyboard();
        keyboard.name = "MX KEYS";
        keyboard.manufacturer = "Logitech";

        Mouse mouse = new Mouse();
        mouse.manufacturer = "Razer";
        mouse.numButtons = 7;


        System.out.println(computer1.price);

    }
}
