package com.example.OOP.basics.packages;

import com.example.OOP.basics.methods.InvokingMethods;

import java.util.Date;

public class PackagesTest {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        InvokingMethods newMethod = new InvokingMethods();
        Date date = new Date();
        date.getTime();
        System.out.println(date);
        Date date2 = new Date();
        System.out.println(date2);

    }
}
