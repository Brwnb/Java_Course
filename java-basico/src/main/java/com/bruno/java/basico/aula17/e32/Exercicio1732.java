/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.java.basico.aula17.e32;

import javax.swing.JOptionPane;

/**
 *
 * Fatorial
 */
public class Exercicio1732 {
    
    public static void main(String args[]){
   
        String value1 = JOptionPane.showInputDialog("Type one Value:");
        int num1 = Integer.parseInt(value1);
        
        int fatorial = 1;
        for (int i=num1;i>0;i--){
            fatorial *= i;
            
        }
        JOptionPane.showMessageDialog(null, "Fatorial of: " + (num1 + "! = " + fatorial ));
    }
}
