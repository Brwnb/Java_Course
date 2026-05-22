package com.bruno.java.basico.aula15;

import java.util.Scanner;


public class Exercicio151 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Type a Integer number: ");
         int number1 = scan.nextInt();
         System.out.println("Type another Integer number: ");
         int number2 = scan.nextInt();
         
         if (number1 > number2){
             System.out.println("The " + number1 + " is greater than " + number2);
         }
         else if (number2 > number1) {
             System.out.println("The " + number2 + " is greater than " + number1);
         }
         else{
             System.out.println("Both numbers are equal!!!!");
         }
              
     }
}
