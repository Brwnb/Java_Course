
package com.bruno.java.basico.aula59;

//Importa os metodos estaticos um por um


  import static java.lang.Math.pow;
  import static java.lang.Math.sqrt;
 

/*
 *Importar todos so métodos da classe math
 *mas não é elegante.
 *import static java.lang.Math.*;
 */
public class StaticImport {

    
    
    public static void main(String args[]) {
       double a,b,c;
       a = 2;
       b = 3;
       c = 4;
       System.out.println(pow(a,b));
       System.out.println(sqrt(c));
               
    }
}
