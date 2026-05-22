/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.5;

         */
// identa todo o código de uma vez Alt + Shift + F
//Caso queira mexer vc mesmo basta selecionar o bloco de código com o mouse e dai vc aperta Alt + Shift e setas do teclado.
// comentar uma linha netbeans Ctrl + Shift + C no windows || Cmd + Shift + C no MACOS
      
       Scanner scan = new Scanner(System.in);
        double[] temperaturas = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Type the temperature: ");
            temperaturas[i] = scan.nextDouble();
        }
        System.out.println("Segue as temperaturas: ");
  /*      for (int i=0; i<temperaturas.length; i++){
            System.out.print(temperaturas[i] + " ");
        }
*/
//  For each no java
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
