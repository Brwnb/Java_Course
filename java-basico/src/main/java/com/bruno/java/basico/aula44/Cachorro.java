package com.bruno.java.basico.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String tamanho;
    private String raca;

    public String getTamanho() {
        return tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String amamentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void levarVeterinario() {

    }

    public void alimentar() {

    }

    public void brincar() {

    }
    public void levarPassear(){
        
    }

}
