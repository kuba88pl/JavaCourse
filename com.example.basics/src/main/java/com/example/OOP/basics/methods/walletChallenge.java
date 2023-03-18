package com.example.OOP.basics.methods;

class Wallet {
    float money;

    public void addMOney(float amount) {
        money += amount;
    }

    public void removeMoney(float amount) {
        money -= amount;
    }

    public void printAmount () {
        System.out.println("Aktualna kwota w portfelu: " + money);
    }
    public Wallet (float money) {
        this.money = money;
    }
}

public class walletChallenge {
    public static void main(String[] args) {

        Wallet wallet = new Wallet(3000);
        wallet.printAmount();


        for (int i = 1; i < 6; i ++) {
            wallet.addMOney(5000);

            wallet.removeMoney(2000);

            wallet.removeMoney(1000);

        }

        wallet.printAmount();

    }
}
