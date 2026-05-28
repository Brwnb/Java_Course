
package com.bruno.java.basico.aula37.e01;


public class Main {

    public static void main(String args[]) {
       
        
        ContaBancaria pessoa = new ContaBancaria();
        pessoa.setNomeCliente("Jonny");
        pessoa.setNumConta("22441100-N");
        pessoa.depositar(120.55);
        pessoa.getSaldo();
        
        System.out.println(pessoa.getNomeCliente());
        System.out.println(pessoa.getNumConta());
        System.out.println(pessoa.getSaldo());
        pessoa.depositar(120.55);
        System.out.println(pessoa.getSaldo());
        pessoa.sacar(50);
        System.out.println(pessoa.getSaldo());
        pessoa.sacar(250);
        System.out.println(pessoa.getSaldo());
        
       // System.out.println(pessoa.getNomeCliente());
        
    }
}
