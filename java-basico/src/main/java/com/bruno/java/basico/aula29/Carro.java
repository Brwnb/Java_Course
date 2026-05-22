/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.java.basico.aula29;

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

    Carro(){ 
        System.out.println("TESTE de Instância" ); 
        numPassageiros = 4; //Podemos usar o metodo de instância para definir valores padrão
    } //Instância nativa do Java que eu escrevi implicitamente. Para teste vou escrever algo
    Carro(String marca_, String modelo_){
        marca = marca_;
        modelo = modelo_;
    } //Podemos ter vários construtores, contato que tenham alguns parâmetros diferentes entre eles.
    
    void exibirAutonomia() {
        JOptionPane.showMessageDialog(null, "A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return km / consumoCombustivel;
    }
}
