package com.example.OOP.basics;

class tv {
    String manufacturer;
    String model;
    int year;
    boolean isSmartTv;

    public void tvInfo() {
        System.out.println(
                this.manufacturer + " " +
                        this.model + " " +
                        this.year + " " +
                        this.isSmartTv

        );
    }
}
public class tvChallenge {
    public static void main(String[] args) {

        tv samsung = new tv();
        samsung.manufacturer="Samsung";
        samsung.model="super200";
        samsung.year=2023;
        samsung.isSmartTv = true;

        samsung.tvInfo();

    }
}
