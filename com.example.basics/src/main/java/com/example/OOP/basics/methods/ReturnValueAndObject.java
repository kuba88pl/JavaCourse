package com.example.OOP.basics.methods;

class Circle {
    float radius;
    Circle (float r) {
        radius = r;
    }

}
class MathMethods {
    public int add (int a, int b) {
        return a+b;
    }

    public int substract(int a, int b) {
        return a-b;
    }

    public Circle getNewCircle(float radius) {
        Circle c = new Circle(radius);
        return c;
    };

}
public class ReturnValueAndObject {
    public static void main(String[] args) {

        MathMethods methods = new MathMethods();
        System.out.println(methods.substract(12,3));
        System.out.println (methods.add(4,5));

        Circle circle = methods.getNewCircle(4.0f);
        System.out.println(circle.radius);
    }
}
