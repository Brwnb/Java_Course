
package com.bruno.java.basico.aula24;

/**
 *
 * @author 
 */

import javax.swing.JOptionPane;
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
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        JOptionPane.showMessageDialog(null, "Marca: " + van.marca + "\n" + "Modelo: " + van.modelo + " km");
    }
}
