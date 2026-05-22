package com.bruno.java.basico.aula25;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        JOptionPane.showMessageDialog(null, "A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }
    
    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }
    
    double calculaCombustivel(double km){
        return km / consumoCombustivel;
    }
}
