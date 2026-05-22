/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19.e01;

/**
 *
 * @author 
 */
public class Exercicio191 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /**
         * outro geito de fazer vetor com valores fixos
         *
         * int[] vector = new int[5]; vector = new int[]{5, 4, 10, 41, 2};
         */
        int[] vector = {5, 4, 10, 22, 2};
        int[] clone = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            //System.out.print(i + " ");
            clone[i] = vector[i];
        }
        System.out.print("Follow Values of the new Array: ");
        for (int i = 0; i < clone.length; i++) {
            System.out.print(clone[i] + " ");

        }
    }
}
