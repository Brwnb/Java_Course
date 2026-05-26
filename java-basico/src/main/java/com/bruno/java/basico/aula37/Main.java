package com.bruno.java.basico.aula37;

/*
* Aulas 37, 38, 39, 40, 41, 42
* MODIFICADORES quem pode aceder os métodos e atributos
* DEFAULT - classe pacote
* PUBLIC - classe pacote subclasse(herança) todo mundo
* PROTECTED - classe pacote subclasse
* PRIVATE - classe
*
* Polimorfismo em tempo de compilação aula 33 (sobrecarga de métodos / overload)
* Polimorfismo em tempo de execução aula 40
 */
public class Main {

    public static void main(String[] args) {

        /*
        Student student = new Student();
        student.setName("Cris");

        Professor professor = new Professor();
        professor.setName("Julius");
        professor.setPhone("66666 6666");
         */
 /* Possui somente acesso as metodos e parâmetros da classe pessoa.
         * Não é possivel aceder as coisas da classe Student.
         * Só é possivel fazer isso porque a classe People é uma Superclasse da classe aluno
         * Util de utilizar com polimorfismo
         */
 /*
        
        
        People student = new Student();
        student.setAddress("St 3, NY");
        
        People professor = new Professor();
        professor.setName("Julius");
         */
        People people = new People();
        People student = new Student();
        People professor = new Professor();

        people.setAddress("St John Lock 66");
        student.setAddress("St John Stuart mill 66");
        professor.setAddress("St Hobalo Baron 66");
        
        
        System.out.println(people.pickUpLabel()); 
        System.out.println(student.pickUpLabel()); 
        System.out.println(professor.pickUpLabel()); 
        
        System.out.println(Constant.URL_SERIE);
        System.out.println(Constant.URL_BLOG);

    }

}
