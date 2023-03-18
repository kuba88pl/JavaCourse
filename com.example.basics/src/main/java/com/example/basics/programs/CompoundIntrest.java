package com.example.basics.programs;

import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double startCapital = 0;
       double yearlyInterest = 0;
       int numYears = 0;
       double finalCapital;

        System.out.print("Wpisz kapital początkowy: ");
        startCapital = Double.valueOf(scanner.nextLine()).doubleValue();
        System.out.print("Wpisz roczne orpocentowanie: ");
        yearlyInterest = Double.valueOf(scanner.nextLine()).doubleValue() ;
        System.out.print("Wpisz ile lat oszczędzałeś: ");
        numYears = scanner.nextInt();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest/100.0d), numYears);

        System.out.println("Efekt oszczędzania z procentem składanym: " + finalCapital);
    }
}
