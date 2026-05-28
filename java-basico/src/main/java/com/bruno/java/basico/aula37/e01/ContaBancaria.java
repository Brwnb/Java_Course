package com.bruno.java.basico.aula37.e01;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public double sacar(double value) {
        if (this.saldo == 0 || value > this.saldo) {
            return 0;
        } else {
            this.saldo = this.saldo - value;
            return value;
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

}
