package com.bruno.java.basico.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String args[]) {
        System.out.println("Entra com um valor: ");
        try { 
            double num = lerNumero();
            System.out.println("Digitou: " + num);
        }
        catch(Exception e){
            System.out.println("Entrada Inválida");
            e.printStackTrace();
        }
    }
    
    

    public static double lerNumero() throws Exception {
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        return num;
    }
}
