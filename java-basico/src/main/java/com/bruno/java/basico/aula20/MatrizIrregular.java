/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula20;

/**
 *
 * @author 
 */
public class MatrizIrregular {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         double [][] notasAlunos = {{10, 7, 9, 9.5},{4, 8},{6}}; 
        
         
        
        for (int i=0;i<notasAlunos.length;i++){
            float soma = 0;
            float count = 0;
            
            for (int j=0;j<notasAlunos[i].length;j++){
                System.out.print(notasAlunos[i][j] + " " + "/" + " ");
                soma += notasAlunos[i][j];
                count++;
            }
            
            System.out.println();
            System.out.println("A média do aluno " + i + " é: " + soma/count);
            System.out.println();
        }
    }
}
