package com.example.OOP.basics.methods;

class Triangle {
    float a;
    float h;
    float surfaceArea;

    Triangle (float base, float high) {
        a = base;
        h = high;
    }
}
class MyMath {
    public void add(int a, int b) {
        a = 20;
        int result = a + b;
        System.out.println("result: " + result);
    }
}
public class InvokingMethods {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int a = 10;
        int b = 7;
        math.add(a,b);
        math.add(7,15);

        Triangle triangle = new Triangle(10.0f, 4.5f);
    }
}
