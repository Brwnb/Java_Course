package com.bruno.java.basico.aula61;

public class PassagemValorParametro {

    public static void main(String args[]) {
        Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        int valor = 10;
/*
        System.out.println("***** Valores originais");

        System.out.println(contato);
        System.out.println(valor);

        System.out.println("***** Exemplo 1");
*/
        testePassagemValorReferencia(valor, contato);
        System.out.println();
        System.out.print("Primeiro Objecto contato 1" + contato);

    /*    System.out.println(contato);
        System.out.println(valor);

        System.out.println("***** Exemplo 2");
*/
        testePassagemValorReferencia2(valor, contato);
/*
        System.out.println(contato);
        System.out.println(valor);
*/
    }

    private static void testePassagemValorReferencia(int valor, Contato contato) {

        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        System.out.print("Valor Referencia de memória contato 2: " + contato);
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato) {

        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato" + novoValor);
    }
}

