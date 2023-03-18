package com.example.control_flow_statements;

public class breakChallenge {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }

        System.out.println("===============");


        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

    }
}
