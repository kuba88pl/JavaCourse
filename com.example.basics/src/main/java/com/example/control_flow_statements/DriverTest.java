package com.example.control_flow_statements;

public class DriverTest {
    public static void main(String[] args) {
        int points = 0;
        boolean driverLicence = true;
        boolean causeAccident = false;
        boolean isDrunken = false;
        boolean overSpeeding = false;
        int experienceYears = 34;

        if (driverLicence == true) {
            points += 20;
        }
        if (causeAccident == true || isDrunken == true) {
            points -= 100;
        }
        if (overSpeeding == true) {
            points -= 10;
        }
        if (experienceYears >= 10) {
            points += 20;
        }
        if (experienceYears > 60) {
            points -= 20;
        }

        System.out.println("Twój kierowca zdobył: " + points + " punktów");
    }
}
