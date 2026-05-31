
package com.bruno.java.basico.aula37.e02;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /*Contribuite pessoa = new Contribuite();
       
       pessoa.setNome("Bruno");
       pessoa.setCpfCNPJ("0555555555");
       pessoa.setRendaBruta(2570.55);
       pessoa.validaAliquota();
       System.out.println(pessoa.toString());
       pessoa.validaDeducao();
       System.out.println(pessoa.toString());
       System.out.println(pessoa.calculaImposto());
       */
       
       PessoaJuridica empresa = new PessoaJuridica();
       empresa.setNome("Julius empreendimentos");
       System.out.println(empresa.toString());
       empresa.setCpfCNPJ("989878787-1221");
       System.out.println(empresa.toString());
       empresa.setAliquota(10);
       System.out.println(empresa.toString());
       empresa.setRendaBruta(25000);
       System.out.println(empresa.toString());
       System.out.println(empresa.calculaImposto());
       
    }
}
