
package com.bruno.java.basico.aula17.e01;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Exercicio171 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        boolean check = false; 
        do{
            System.out.println("Type any value between 0 and 10: ");
            float value = scan.nextFloat();
            if (value >= 0 && value <= 10){
                check = true;
            }
            else{
                System.out.println("Type an Correct value!!!");
                check = false;
            }
                       
        }while(check == false);
    }
}
