/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula29;

/**
 *
 * @author 
 */
public class TesteCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Carro van = new Carro(); //Chamando a instância ou instânciando uma classe
        System.out.println("Valor default definido na instância da classe: " + van.numPassageiros);
        
        Carro van2 = new Carro("Fiat","Ducato"); //Aqui estou chamando o Contrutor que recebe dois parâmetros da classe carro.
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
    }
}
