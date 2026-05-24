package com.bruno.java.basico.aula37;

/*
* Aulas 37, 38, 39, 40, 41, 42
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
        People student = new Student();
        student.setAddress("St 3, NY");
        
        People professor = new Professor();
        professor.setName("Julius");
    }

}
