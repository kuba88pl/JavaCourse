package org.example;

public class Main {
    public static void main(String[] args) {
        int[] items = {1 ,2, 3, 4};
        int sum = 0;

        for ( int i = 0; i < items.length; i ++) {
            sum = sum + items[i];
        }
        System.out.println(sum);

        double average = (sum / (double)items.length);
        System.out.println("Średnia z " + sum + " = " + average);

        System.out.println("Inkrementacja: " + ++sum);
        System.out.println("Dekrementacja: " + --sum);
    }
}