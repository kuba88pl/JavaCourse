package com.example.data.String_class;

public class StringsComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLo";

        if (s2.equals(s1)) {
            System.out.println("TRUE");
        }

        if (s2.equals(s3)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE!");
        }

        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("TRUE");
        }

    }
}
