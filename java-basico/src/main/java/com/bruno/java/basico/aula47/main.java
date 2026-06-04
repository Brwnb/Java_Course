package com.bruno.java.basico.aula47;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            int[] vector = new int[4];

            System.out.println("Antes da exception");

            vector[4] = 1;
             System.out.println("não será executado");
        } 
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exceção ao acessar um indice que não existe");
        }
         System.out.println("Depois da exception");
    }
}
