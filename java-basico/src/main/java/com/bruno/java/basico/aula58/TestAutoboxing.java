package com.bruno.java.basico.aula58;

public class TestAutoboxing {

    public static void main(String args[]) {
        // Autoboxing permite a atribuição direta do tipo primivo para uma classe sem a
        // a necessidade de instânciar a classe.

        Short num7 = 1;
        Byte num8 = 1;
        Integer num9 = 100;
        Integer string2 = 100;
        Long num10 = 1000L;
        Float num12 = 3.5f;
        Double num13 = 3.55555;
        Boolean flag2 = true;
        Character b = 'b';

        //Auto un-boxing
        int num14 = num9; //num9.intValue();

        //Auto Boxing em expressões
        num9++;
        num9++;
        System.out.println(num9);

        //O num14 é do tipo primitivo
        //O num9 é uma classe
        //Então está acontecendo um auto unboxming do num9 e um autoboxing da expressão num9-num14
        Integer num15 = num9 - num14;
        
        // Evite ficar usando autoboxing e auto un-boxing sem necessidade
        Double d,e,f;
        d = 10.4;
        e = 10.3;
        f = 10.2;
        double media = (d+e+f)/3; //tipo, pra que? poderia ter feito tudo em primitivos e depois convertia para classe.

        /*
        * Quando usar wrapper?
        * Quando for trabalhar com collections
        * Quando se precisa de trabalhar com ausencia de valor tipo idade = null;
        * Quando se precisa utilizar métodos que já existem nas classes wrappers
        * Trabalhando com APIs que existem objetos
         */
        //-------------------------------------------
        //---------------------------------------
                
        /*
         * Quando usar?
         * É simples
         * Não precisa de null
         * Está em código crítico (performance)
         */
    }
}
