package com.bruno.java.basico.aula57;

/*
*  Classes Wrapper sao classes que representar os tipos primitivos
* 
 */
public class TestWrapper {

    public static void main(String args[]) {
        // Tipos primitivos
        // Para saber o tamanho possível aceito por cada tipo, procure por
        // tabela tamanho dos tipos primitivos java
        //
        short num = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000L; // o L pode ser minusculo
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true; // or false
        char a = 'a'; // Pode ser um numero que vai representar uma letra na tabela ANSII
        
        // ----------------------
        //--------------------
        // classes Wrappers usando diretamente os construtores´
        // Há conversões automáticas ou devemos forçar a conversão
        
        Short num7 = new Short((short)1); // A propria ide reclama que é preciso converter o numero 1 para short
        
        Byte num8 = new Byte((byte)1); // O mesmo acontece com o byte é preciso converter
        Byte letra2 = new Byte((byte)a);
        Integer num9 = new Integer(100);
        //Integer string = new Integer("100hh"); //vai dar erro em tempo de execução
        Integer string2 = new Integer("100"); //tudo certo. há conversão automática
        Long num10 = new Long(1000L); // ou  Long num11 = new Long((long) 1000);
        Float num12 = new Float(3.5f);
        Double num13 = new Double(3.55555);
        Boolean flag2 = new Boolean(true); // or false
        Character b = new Character('b');
        
        /*
        * Todas as classes possuem métods que em sua maioria serve para conversão
        * Como o intValue(), floatValue(), shorValue(), doubleValue().
        * Mas reforçando que existem outros como equals(), compareTo(), isNaN()
        */
        System.out.println(num13.intValue()); 
        
        // conversão fora do construtor usando o parse
        int num16 = Integer.parseInt("1000");
        double num17 = Double.parseDouble("64.55");
        
        //Transforma o tipo primito em uma instância da Classe Integer usando o valueOf()
        Integer num18 = Integer.valueOf(13313);
        
        // tipos primitvos aceitam 5 == 5 ou 5 != 6.
        // Classes temos que usar o equals, porque usar == estariamos comparando o endereço de memória entre os objetos
        
        System.out.println(num9.equals(num10));
    }
}
