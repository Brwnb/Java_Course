
package com.bruno.java.basico.aula55;

import com.bruno.java.basico.aula54.DiaSemana;
// metodo valueof e metodo values

public class Main2 {

  
    public static void main(String args[]) {
        
       
        DiaSemana dia;
        
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        
        // ou
        DiaSemana segunda =  Enum.valueOf(DiaSemana.class, "SEGUNDA");
        System.out.println(segunda);
        
        
    }
}
