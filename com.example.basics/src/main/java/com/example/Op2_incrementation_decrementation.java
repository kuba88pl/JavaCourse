package com.example;

public class Op2_incrementation_decrementation {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);

        int b = 5;
        int c = 10 + b++; // inkrementacja przyrostkowa
        System.out.println(c);
        System.out.println(b);

        b = 5;
        c = 10 + ++b; //inkrementacja przedrostkowa
        System.out.println(c);
        System.out.println(b);

    }



}
