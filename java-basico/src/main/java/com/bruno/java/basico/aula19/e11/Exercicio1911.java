/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19.e11;

/**
 *
 * @author 
 */
public class Exercicio1911 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int[] array = {20, 31, 44, 74, 33, 45, 51, 5, 3, 9};
        int count = 0;
        
        
        System.out.print("Follow the even number: " );
        for (int i=0;i<array.length;i++){
            
            if (array[i] % 2 == 0){
                count++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("In the Original array we have:  " + count);
    }
}
