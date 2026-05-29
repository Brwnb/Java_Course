package com.bruno.java.basico.aula37.e01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    /*
    @Override
    public Srring sacar() {
        return super.sacar(); 
    }
     */
    @Override
    public String toString() {
        String s = "ContaEspecial[";
        s += " limite: " + limite;
        s += super.toString();
        s += "]";
        return s;
    }

    public boolean sacar(double value) {

        double saldoLimite = this.getSaldo() + limite;
        if ((saldoLimite - value) >= 0) {
            this.setSaldo(this.getSaldo() - value);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
