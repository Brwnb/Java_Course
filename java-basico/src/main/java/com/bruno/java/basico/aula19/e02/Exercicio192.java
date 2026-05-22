/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19.e02;

/**
 *
 * @author 
 */
public class Exercicio192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] array = {5, 8, 22, 7, 66, 45, 88, 21};
        int[] clone = new int[8];
       
        for (int i=0;i<array.length;i++){
            clone[i] = array[i] * 2;
        }
       
        System.out.print("Follow the Values of 1st array: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
        System.out.print("Follow duble Values of the array: ");
          for (int i=0;i<clone.length;i++){
            System.out.print(clone[i] + " ");
        }
    }
}
