package com.example.data.String_class;

public class StringBuilderChallenge {
    public static void main(String[] args) {
        String [] names = {"Kuba", "Ewela", "Tomek"};
StringBuilder builder = new StringBuilder();
      for ( String name : names ) {
          builder.append(name);
          builder.append(" ");
        }

        System.out.println(builder.toString());
    }
}
