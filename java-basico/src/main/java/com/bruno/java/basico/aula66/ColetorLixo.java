
package com.bruno.java.basico.aula66;

import com.bruno.java.basico.aula61.Contato;

public class ColetorLixo {
  

    public static void obterMemoriaUsada(){
        
        final int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime(); //singleton -> padrão de projeto em java web
        System.out.println(runtime.totalMemory() - runtime.freeMemory()/MB);
        
    }
    public static void main(String args[]) {
       Contato[] contatos = new Contato[100000000];
       
       Contato contato;
       
       for (int i=0;i<contatos.length;i++){
           contato = new Contato("Contato" + i,"123456" + i, "contato" + i + "@email.com");
           contatos[i] = contato;
       }
       
       System.out.println("Contatos Criados");
       obterMemoriaUsada();
       contatos = null;
       
       Runtime.getRuntime().runFinalization();
       Runtime.getRuntime().gc();
       
       System.out.println("Contatos removidos da memória");
       obterMemoriaUsada();
    }
}
