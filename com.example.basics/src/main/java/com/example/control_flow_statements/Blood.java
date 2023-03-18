package com.example.control_flow_statements;

public class Blood {
    public static void main(String[] args) {

        Person person = new Person();
        person.getAge(17);
        person.getWeight(24);

        if (person.age >= 18 && person.weight >= 50) {
            System.out.println("Możesz oddać krew!");
        } else {
            System.out.println("Nie możesz oddać krwi ponieważ nie spełniasz wymagań! \nTwoja waga to "
                    + person.weight + ". Twój wiek to " + person.age + ".");
        }

    }

}

class Person {
    public int age = 0;
    public int weight = 0;

    public int getAge(int age) {
        this.age = age;
        return age;
    }

    public int getWeight(int weight) {
        this.weight = weight;
        return weight;
    }
}
