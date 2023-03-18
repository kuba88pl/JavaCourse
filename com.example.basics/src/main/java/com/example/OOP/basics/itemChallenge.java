package com.example.OOP.basics;
class Item {
    static int numItems = 0;

    final int ID;

   public Item (int id) {
        ID = id;
    }


    public static int getNextId() {
       return Item.numItems++;
    }

    public static Item getItem() {
       int id = Item.getNextId();
       Item item = new Item(id);
       return item;
    }

   public static void printNumItems() {
        System.out.println("Aktualna wartość numItems : " + Item.numItems);
    }

    public void printId() {
        System.out.println("Aktualna wartość ID : " + this.ID);
    }
}
public class itemChallenge {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Item item = Item.getItem();
            item.printId();
        }
        Item.printNumItems();
    }
}
