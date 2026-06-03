package com.bruno.java.basico.aula37.e02;

public class PessoaJuridica extends Contribuinte {

   
    private String CNPJ;
   
     public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public double calculaImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica[";
        s += super.toString();
        s += " ;cnpj: " + CNPJ;
        s += " ;imposto a ser pago: " + calculaImposto();
        s += "]";
        return s;
    }

}
