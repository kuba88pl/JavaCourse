package com.example;

import org.w3c.dom.ls.LSOutput;

public class Op7_compound_assignmentOperators {
    public static void main(String[] args) {


        // złożone operatory przypisania
        // += , -= , *=, /= , %=

        int a = 5;
        a += 10; // to samo co a = a + 10;
        System.out.println(a); // 15


        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 20;
        c %= 3;
        System.out.println(c);
    }
}