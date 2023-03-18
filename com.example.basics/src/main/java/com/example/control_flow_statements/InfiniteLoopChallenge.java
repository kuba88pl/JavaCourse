package com.example.control_flow_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteLoopChallenge  {
    public static void main(String[] args) throws IOException {

   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   int number = 0;

   for( ; ; ) {
       System.out.print("Podaj jakąś liczbę, lub wpisz quit, aby zakończyć: ");
       String text = reader.readLine();
       if(text.equalsIgnoreCase("quit")){
           break;
       }
       int num = Integer.parseInt(text);

//       int num = (int)reader.readLine(text);
       number += num;
       System.out.println("Wartość number = " + number);
   }


    }
}
