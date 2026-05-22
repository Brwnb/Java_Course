/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19.e12;

/**
 *
 * @author 
 */
public class Exercicio1912 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int[] array = {5, 8, 10, 55, 32, 10, 41, -15, 66, -50};
        int sum = 0;
        
        System.out.println("Follow the values no Array: ");
        for (int i=0;i<array.length;i++){
            //sum = sum + array[i];
            sum +=  array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("The sum of the values on the array is: " + sum);
    }
}
