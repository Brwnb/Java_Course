
package com.bruno.java.basico.aula44;

/**
 *
 * upcasting and downcasting
 * Upcasting significa instanciar um objeto de uma classe superior
 * Downcasting significa instanciar um objeto de uma inferior 
 * Mas o Downcasting pode dar problemas devido aos atritubos das classes inferiores ou subclasses
 * Erro em tempo de execução.
 * 
 * Porque por exemplo uma subclasse pode ter um atributo que precisa ser usado.
 * outro ponto é que um objeto pode por exemplo ser um inteiro e na conversão pode ser que quem vai receber essa conversão seja uma String, dai falha
 * 
 * 
 * InstanceOf utilizado para sabermos de que tipo é a instância. Muito bom para validações.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Cachorro cao = new Cachorro();
        Mamifero mamifero = cao; //Upcasting
        
        Mamifero dog = new Cachorro(); // Upcasting conversão direto ->  Mamifero dog = (Mamifero) new Cachorro()
        
       Object gato = new Object();
       // Gato miau =  gato; -> não é possivel fazer sem converter veja abaixo
       //Gato miau = (Gato) gato; // -> Convertemos o obijeto gato da Classe Objeto em Objeto da Classe Gato
        
       if(cao instanceof Cachorro){
           System.out.println("É do tipo Cachorro");
       }
         if(gato instanceof Object){
           System.out.println("É do tipo Object");
       }
    }
}
