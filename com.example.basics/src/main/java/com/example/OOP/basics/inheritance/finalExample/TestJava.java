package com.example.OOP.basics.inheritance.finalExample;

class Employee {
    String name;
    String lastName;
    String jobTitle;
    float salary;
}

class Manager extends Employee {
    String responsibility;
}

class Director extends Manager {
    String department;
}

class VicePresident extends Director {
}

final class CEO extends VicePresident {  //NIE MOŻNA ROSZERZYĆ KLASY FINAL!!!
    String companyName;
}

public class TestJava {
    public static void main(String[] args) {
        CEO ceo = new CEO();
    }


}
