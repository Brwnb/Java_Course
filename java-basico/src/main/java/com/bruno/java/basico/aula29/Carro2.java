/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.java.basico.aula29;

/**
 *
 * @author 
 */
public class Carro2 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro2(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro2(String marca) {
        this.marca = marca;
    }

    public Carro2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro2() {
        
    } // No menu vá em source > insert code ou alt + insert gera os construtores automaticamente e te dá opções de escolhas.
    
}
