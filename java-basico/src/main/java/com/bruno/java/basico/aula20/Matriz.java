/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula20;

/**
 *
 * @author 
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       // double[][] notasAlunos = new double[3][4];
      /*  
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 4;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 5;
        
        notasAlunos[2][0] = 6;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;
       */
        // uma forma de iniciar uma matriz com vários valores é
        double [][] notasAlunos = {{10, 7, 9, 9.5},{4, 8, 7, 5},{6, 9, 10, 7}}; 
        
        
        for (int i=0;i<notasAlunos.length;i++){
            float soma = 0;
            float count = 0;
            
            for (int j=0;j<notasAlunos[i].length;j++){
                System.out.print(notasAlunos[i][j] + " ");
                soma += notasAlunos[i][j];
                count++;
            }
            
            System.out.println();
            System.out.println("A média do aluno " + i + " é: " + soma/count);
            System.out.println();
        }
    }
}
