/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19.e18;

/**
 *
 * @author 
 */
public class Exercicio1918 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        int[] array = {70, 8, 10, 55, 3, 10, 41, 15, 66, 50};
        
        int youngestPosition = 0;
        int oldestPosition = 0;
        
        int idadeMenor = array[0];
        int idadeMaior = array[0];
        
        for (int i = 1; i < array.length; i++) {
            
            if(idadeMenor > array[i]){
                idadeMenor = array[i];
                youngestPosition = i;
            }
            if(idadeMaior < array[i]){
                idadeMaior = array[i];
                oldestPosition = i;
            }
        }
        System.out.println("The youngest age found in the array was: " + idadeMenor);
        System.out.println("Youngest position on the array: " + youngestPosition);
        System.out.println("The oldest age found in the array was: " + idadeMaior);
        System.out.println("Oldest position on the array: " + oldestPosition);
    }
}
