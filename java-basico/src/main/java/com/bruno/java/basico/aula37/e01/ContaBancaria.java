package com.bruno.java.basico.aula37.e01;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ContaBancaria(String nomeCliente, String numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public boolean sacar(double value) {
        if (this.saldo == 0 || value > this.saldo) {
            return false;
        } else {
            this.saldo = this.saldo - value;
            return true;
        }

    }

    public void depositar(double value) {

        if (value > 0) {
            this.saldo = this.saldo + value;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        String s ="ContaBancaria[";
        s += " nomeCliente " + nomeCliente;
        s += "; numConta " + numConta;
        s += "; saldo " + saldo;
        s += "]";
        return s;
    }
    
    

}
