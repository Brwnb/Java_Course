/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula20;

/**
 *
 * @author 
 */
public class MatrizCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[][][] cubo = new int[3][3][3];
        
        
        for (int i=0;i<cubo.length;i++){
            for (int j=0;j<cubo[i].length;j++){
                for (int k=0;k<cubo[i][j].length;k++){
                    cubo[i][j][k] = i + j + k;
                }
            }
        }
    
    
        for (int i=0;i<cubo.length;i++){
            for (int j=0;j<cubo[i].length;j++){
                for (int k=0;k<cubo[i][j].length;k++){
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } 
    }
}
