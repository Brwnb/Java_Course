

package com.bruno.java.basico.aula37.e01;

import java.util.Calendar;


public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente) {
        super(nomeCliente);
    }

    public ContaPoupanca(String nomeCliente, String numConta) {
        super(nomeCliente, numConta);
    }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }
    
    
    
    public void calcularNovoSlado(double taxaRendimento){
     //   super.saldo;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca[";
        s += " DiaRendimento: " + diaRendimento;
        s += super.toString();
        s += "]";
        return s;
    }
    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
           // saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo()+ (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
    

    
   
    
}
