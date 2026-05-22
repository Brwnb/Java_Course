/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula35;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class TesteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Calculadora fat = new Calculadora();
        
        String value1 = JOptionPane.showInputDialog("Type one Value:");
        int num = Integer.parseInt(value1);
        
         JOptionPane.showMessageDialog(null, "Recursive Fatorial: " + (fat.fatorial(num)));
    }
}
