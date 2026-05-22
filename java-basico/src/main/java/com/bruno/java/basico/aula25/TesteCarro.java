/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula25;

import javax.swing.JOptionPane;

/**
 * Aula 25, 26 e 27
 */
public class TesteCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        //van.exibirAutonomia();
        
        JOptionPane.showMessageDialog(null, "A autonomia do carro é: " + van.obterAutonomia() + " km");
        
        String value1 = JOptionPane.showInputDialog("Type The Kilometers: ");
        double num1 = Double.parseDouble(value1);
       
         JOptionPane.showMessageDialog(null, "A quantidade de combustivel será de: " + van.calculaCombustivel(num1) + " Litros");
    }
}
