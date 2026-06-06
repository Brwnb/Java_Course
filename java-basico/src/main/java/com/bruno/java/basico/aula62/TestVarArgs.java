
package com.bruno.java.basico.aula62;

// Varargs é a técnica de passar varios valores sem a necessidade de declarar 
// um vetor/array a um método.
public class TestVarArgs {

    
    public static void main(String args[]) {
       
        System.out.println(soma(2.0, 2.1, 3.5, 4.4, 5.6, 6.6));
    }
    
    static  double soma(Double... vetor){
        Double total = 0.0;
        for(Double a : vetor){
            total += a;
        }
        return total;
    }
}
