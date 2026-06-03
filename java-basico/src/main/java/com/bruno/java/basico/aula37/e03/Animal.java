
package com.bruno.java.basico.aula37.e03;


public class Animal {
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        this.patas = 4;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public String getCor() {
        return cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    
  
       @Override
    public String toString() {
          String s = "Nome: " + nome;
        s += " ;Comprimento: " + comprimento;
        s += " ;Patas: " + patas;
        s += " ;Cor: " + cor;
        s += " ;Ambiente: " + ambiente;
        s += " ;Velocidade: " + velocidade;
        return s;
    }
}
