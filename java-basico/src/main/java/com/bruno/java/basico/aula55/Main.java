
package com.bruno.java.basico.aula55;

import com.bruno.java.basico.aula54.DiaSemana;

public class Main {

  
    public static void main(String args[]) {
        
        DiaSemana[] dias = DiaSemana.values();
        
        for(DiaSemana n : dias){
            System.out.println(n);
        }
        
    }
}
