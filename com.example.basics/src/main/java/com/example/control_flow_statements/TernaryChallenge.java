package com.example.control_flow_statements;

public class TernaryChallenge {
    public static void main(String[] args) {
        int a = 11;
        boolean parzysta = false;
      int b = (a % 2 == 0) ? a : (a % 2);
      String info = (a % 2 == 0) ? "Parzysta" : "dupa";
        System.out.println(b);
        System.out.println(info);

    }
}
