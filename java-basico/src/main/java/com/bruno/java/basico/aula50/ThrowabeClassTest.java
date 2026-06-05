package com.bruno.java.basico.aula50;

public class ThrowabeClassTest {

    public static void main(String args[]) {
        /*
        Throwable é uma superclasse e aqui nesse comentário é para ver os principais métodos usados. 
        Na vida real utilizamos a classe Exception
       Throwable e = new Throwable();
       e.getMessage(); //-> retorna a descrição do erro
       e.printStackTrace(); //-> printa o rastreamento da pilha
       e.
         */

        int[] num = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + "/" + denominador[i] + " = " + num[i] / denominador[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
