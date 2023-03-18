package com.example.control_flow_statements;

public class Continue {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if(i == 2 || i == 5 || i == 9) continue;
            System.out.println(i);
        }
    }
}