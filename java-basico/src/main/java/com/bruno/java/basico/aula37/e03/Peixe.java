/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.java.basico.aula37.e03;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {
        super();
        this.setPatas(0);
        this.setCor("cinzento");
        this.setAmbiente("Mar");
        this.caracteristicas = "Bararbatanas e Calda";
    }
    
    

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\n Características: " + caracteristicas;
        return s;
    }
}
