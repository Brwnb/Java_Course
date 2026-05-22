/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19.bubbleSort;

import static java.lang.Thread.sleep;

/**
 *
 * @author 
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        int[] array = {11, 101, 22, -5, 44, 10, 0, -22, 3, -3, -99, 2, 7, 31};

        for (int i = 0; i < array.length - 1; i++) {
            
            
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
                for (int num: array){
                    System.out.print(num + " ");
                }
                //sleep(500);
                System.out.println();
            }
            
        }
    }
}
