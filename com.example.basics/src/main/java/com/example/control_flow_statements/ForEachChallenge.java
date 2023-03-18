package com.example.control_flow_statements;

public class ForEachChallenge {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Suma liczb w tablicy to : " + sum);

    }
}
