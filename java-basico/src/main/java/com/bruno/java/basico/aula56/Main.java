
package com.bruno.java.basico.aula56;


public class Main {

  
    public static void main(String args[]) {
        
        /*for (TipoDocumento id : TipoDocumento.values()){
            System.out.println(id.geraNumeroTeste());
        }*/
        
        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);
        
        
        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);
    }
}
