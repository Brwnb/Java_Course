
package com.bruno.java.basico.aula49;



public class MultiplosCatchFinally {


    public static void main(String args[]) {
        int[] num = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};
        
        for(int i=0; i<num.length;i++){
            try{
                System.out.println(num[i] + "/" + denominador[i] + " = " + num[i]/denominador[i]);
            }
            catch(ArithmeticException exception){
                System.out.println("Erro ao dividir por 0");
                System.exit(0);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do array inválido");
            }
            finally{
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }
        }
    }
}
