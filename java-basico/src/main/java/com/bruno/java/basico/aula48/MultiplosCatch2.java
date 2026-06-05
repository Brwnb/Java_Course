
package com.bruno.java.basico.aula48;


public class MultiplosCatch2 {


    public static void main(String args[]) {
        int[] num = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};
        
        for(int i=0; i<num.length;i++){
            try{
                System.out.println(num[i] + "/" + denominador[i] + " = " + num[i]/denominador[i]);
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Erro Genérico");
            }
           /* catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do array inválido");
            }*/
            /*
            catch(Throwable e){
                System.out.println("Erro Genérico");
            }*/
        }
    }
}
