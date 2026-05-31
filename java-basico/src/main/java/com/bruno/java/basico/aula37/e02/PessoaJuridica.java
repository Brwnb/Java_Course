
package com.bruno.java.basico.aula37.e02;


public class PessoaJuridica extends Contribuite {
    private int aliquota;

    @Override
    public int getAliquota() {
        return aliquota;
    }

    @Override
    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public double calculaImposto() {
        return ((super.getRendaBruta() * this.aliquota) / 100);
    }


    
}
