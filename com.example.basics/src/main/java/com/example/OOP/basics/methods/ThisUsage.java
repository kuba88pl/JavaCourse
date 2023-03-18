package com.example.OOP.basics.methods;
class Radio {
    int yearProduction;
    int volume;
    String station;
    Radio () {
        this.yearProduction = 2000;
        this.volume = 100;
    }

    Radio (int yearProduction) {
        this(); //wywolanie konstruktora bezargumentowego
        this.yearProduction = yearProduction;
        this.changeStation("Rock");
    }

    public void changeStation(String newStation) {
        this.station = newStation;
    }

    public Radio getRadio(){
        return this;
    }

    public void printRadioInfo(Radio radio) {
        System.out.println("Radio production year: " + radio.yearProduction);
    }
}
public class ThisUsage {
    public static void main(String[] args) {
        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);
        newRadio.printRadioInfo(newRadio);


    }
}
