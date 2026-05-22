/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.java.basico.aula30;

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

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel; //O this serve para colocar de forma implicita que a variavel pertence a classe carro
    }

    public Carro(String marca, String modelo) {
        this("Fiat", "Ducato", 10); //Esse this está referenciando a outro contrutor, no caso com 3 parâmetros
    } // 

    public Carro(String marca, String modelo, int numPassageiros) { // marca, modelo e numPassageiro pertencem ao construtor 
        //ou método o this.marca this.modelo this.numPassageiro pertence à classe  Carro. Assim evitamos colocar variaveis com nomes estranhos tipo String marca_
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    void exibirAutonomia() {
        JOptionPane.showMessageDialog(null, "A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return km / this.consumoCombustivel;
    }

}
