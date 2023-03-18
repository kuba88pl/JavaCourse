package com.example.OOP.basics;

class PLaneWithStatic {
    static int nextId = 1;
    int id;
    int x, y;


    PLaneWithStatic() {
        id = PLaneWithStatic.getNextId();

    }

    static int getNextId() {
        return nextId++;
    }
}

public class StaticExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public int Substract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        PLaneWithStatic plane1 = new PLaneWithStatic();
        PLaneWithStatic plane2 = new PLaneWithStatic();
        PLaneWithStatic plane3 = new PLaneWithStatic();

        System.out.println("plane1.id:" + " " + plane1.id);
        System.out.println("plane2.id:" + " " + plane2.id);
        System.out.println("plane3.id:" + " " + plane3.id);

        System.out.println(StaticExample.add(3,5));

       StaticExample sexample = new StaticExample();
       sexample.Substract(3,4);
    }
}
