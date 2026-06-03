package com.bruno.java.basico.aula37.e02;

public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
   
    

    public abstract double calculaImposto();

    @Override
    public String toString() {
          String s = "Nome: " + nome;
        s += " ;rendaBruta: " + rendaBruta;
        return s;
    }
    
        
}
