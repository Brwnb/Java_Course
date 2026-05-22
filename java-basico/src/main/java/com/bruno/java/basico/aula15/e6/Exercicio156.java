/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula15.e6;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Exercicio156 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type a Integer number: ");
        int number1 = scan.nextInt();
        
        System.out.println("Type another Integer number: ");
        int number2 = scan.nextInt();
        
        System.out.println("Type a 3rd Integer number: ");
        int number3 = scan.nextInt();
        
        if (number1 > number2 && number1 > number3) {
            System.out.println("The " + number1 + " is the biggest!!");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println("The " + number2 + " is the biggest!!");
        }
        else if (number3 > number1 && number3 > number2){
            System.out.println("The " + number3 + " is the biggest!!");
        }
        else{
            System.out.println("All the numbers are equal!!!");
        }
    }
}
