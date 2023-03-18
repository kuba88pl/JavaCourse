package com.example.control_flow_statements;

public class Wheater {

    public static void main(String[] args) {

        int temperature = 20;
        boolean isRaining = true;
        boolean hasUmnbralla = true;


        if (temperature > 40 && temperature < -20) {
            System.out.println("Pozostań w domu!");

        } else if (temperature <= 10 && temperature >= -10) {
            if (hasUmnbralla) {
                System.out.println("Możesz wyjść!");

            }
        } else if (temperature > 12 && isRaining) {
            System.out.println("Możesz wyjść!");

        } else {
            System.out.println("Pozostań w domu!");
        }

    }

}

