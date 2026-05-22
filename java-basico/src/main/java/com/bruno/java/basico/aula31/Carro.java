/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.java.basico.aula31;

import javax.swing.JOptionPane;

/**
 *
 * MODIFICADORES DE ACESSO PUBLIC E PRIVATE
 */
public class Carro { //public qualquer outra classe dentro do projeto java-basico tem acesso às variáveis. marca, modelo etc etc.

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel; // private Acessivel somente dentro da própria classe

    public void exibirAutonomia() {
        JOptionPane.showMessageDialog(null, "A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    public double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    public double calculaCombustivel(double km) {
        return divideKMPorConsumoCombustivel(km);
    }
    private double divideKMPorConsumoCombustivel(double km){
        return km / this.consumoCombustivel;
    }
}

class Carro2 { // Aqui não foi definido nenhum modificador de acesso então está no default. 
    //Somente será acessivel dentro do pacote com.bruno.java.basico.aula31;

    String marca; // O mesmo vale para as variáveis dentro da classe. Somente será acessivel dentro do pacote com.bruno.java.basico.aula31;
    String modelo; // Pois não foi definido nenhum modificador. então está no default
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
}
