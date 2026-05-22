/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula19.e03;

import static java.lang.Math.pow;

/**
 *
 * @author 
 */

public class Exercicio193 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] A = {5, 8, 22, 7, 66, 45, 88, 21};
        int[] B = new int[8];
        
        for (int i=0;i<A.length;i++){
          //  B[i] = A[i] * A[i];
          B[i] = (int) pow(A[i],2);
        }
        
        for (int i=0;i<B.length;i++){
            System.out.print(B[i] + " ");
            //sqrt(10);
        }
    }
}
