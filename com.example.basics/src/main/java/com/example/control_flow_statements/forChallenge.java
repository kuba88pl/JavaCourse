package com.example.control_flow_statements;

public class forChallenge {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println("================================");

        for (int i = numbers.length - 1; i >= 0; i--) {
            int number = numbers[i];
            System.out.println(number);
        }

    }
}
