package com.bruno.java.basico.aula15.e2;

import java.util.Scanner;


public class Exercicio152 {

   
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a Integer number: ");
        int number1 = scan.nextInt();
        
        if (number1 > 0){
            System.out.println("The " + number1 + " is positive!!");
        }
        else if(number1 < 0){
            System.out.println("The " + number1 + " is negative!!");
        }
        else{
             System.out.println("The " + number1 + " is zero!!");
        }
                
    }
}
