package com.example.data.String_class;

public class ConcatChallenge {
    public static void main(String[] args) {
        String [] names = {"Kuba", "Ewelina", "Karol", "Dawid"};

     for (String name : names) {

         String all = new String();
         all = name.join(" ", names);
         System.out.println(all); break;
        }

    }
}
