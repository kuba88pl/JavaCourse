package com.example.OOP.basics;

public class studentChallenge {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Jakub", "Kulawik", "Bytom", 35);

        student1.printBasicData();
        System.out.println("===================");
        student2.printBasicData();
    }
}


class Student {
    String name;
    String lastName;
    String city;
    int age;

    public Student () {
        this.name = "unknown";
        this.lastName = "unknown";
        this.city = "unknown";
        this.age = 0;
    }

    public Student (String name, String lastName, String city, int age) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println(this.name + " " +
                this.lastName + " " +
                this.city + " "+
                this.age
        );
    }
}