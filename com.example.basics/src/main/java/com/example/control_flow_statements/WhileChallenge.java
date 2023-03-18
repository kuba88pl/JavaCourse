package com.example.control_flow_statements;

public class WhileChallenge {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int a = 0;
        while (a < numbers.length){
            System.out.println(numbers[a] * 2);
            a++;

        }
    }
}
