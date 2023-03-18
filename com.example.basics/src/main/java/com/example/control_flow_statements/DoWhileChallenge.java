package com.example.control_flow_statements;

public class DoWhileChallenge {
    public static void main(String[] args) {

        int a = 0;

        do {
            a++;
            if (a % 2 != 0) {
                System.out.println(a);
            }
        } while (a <= 20 - 1);
    }
}
