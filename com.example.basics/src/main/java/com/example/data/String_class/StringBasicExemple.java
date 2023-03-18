package com.example.data.String_class;

public class StringBasicExemple {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "jakiś tekst";
        char test = 's';
        String s3 = new String("XXX");

        String s4 ="Test ".repeat(4);
        System.out.println(s4);
        String s5 = String.join(s3, "asdasda", "asdasdasd");
        System.out.println(s5);


        char[] arr = {'s', 'd', 'k'};

        String s6 = new String(arr);
        System.out.println(s6);
        
        int year = 2023;
        String car;
        String txt1 = "BMW";
        car = txt1 + year;
        System.out.println(car);
    }
}
