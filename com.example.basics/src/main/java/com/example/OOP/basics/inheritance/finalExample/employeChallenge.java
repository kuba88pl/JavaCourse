package com.example.OOP.basics.inheritance.finalExample;

class Emplloyee {
    String name;
    String lastName;

    public Emplloyee() {
    }

    public Emplloyee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println("Employee: " + this.name + " " + this.lastName);
    }
}

class Administrator extends Emplloyee {
    String certificates;

    public Administrator(String name, String lastName, String certificates) {
        this.name = name;
        this.lastName = lastName;
        this.certificates = certificates;
    }

    public void printInfo() {
        System.out.println("Administrator: " + this.name + " " + this.lastName + " " + this.certificates);
    }
}

class Programmer extends Emplloyee {
    String languages;

    public Programmer(String name, String lastName, String languages) {
        this.languages = languages;
        this.name = name;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println("Programmer " + this.name + " " + this.lastName + " " + this.languages);
    }
}

public class employeChallenge {
    public static void main(String[] args) {
        Emplloyee emplloyee1 = new Emplloyee("Łukasz", "Nowak");
        emplloyee1.printInfo();
        Administrator admin = new Administrator("Ewelina", "Stolecka", "CCNA");
        admin.printInfo();
        Programmer programista = new Programmer("Jakub", "Kulawik", "JAVA");
        programista.printInfo();
    }
}
