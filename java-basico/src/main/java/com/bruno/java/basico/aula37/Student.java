/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula37;

public class Student extends People {
  
    private String[] courses;
    private String[][] grade;

    public Student() {
        super();
    }

    public Student(String name, String address, String phone) {
        super(name, address, phone);
    }

    public Student(String[] courses, String name, String address, String phone) {
        super(name, address, phone);
        this.courses = courses;
    }

    
    public String[] getCourses() {
        return courses;
    }

    public String[][] getGrade() {
        return grade;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setGrade(String[][] grade) {
        this.grade = grade;
    }
    
    public double calcAverage(){
        
        return 5;
    }
    public double checkApproved (){
        return 5;
    }
    public void randomMetod(){
        //Duas formas diferentes de acessoar os métodos e atributos da classe pai
        super.setId("123456");
        this.setId("123456");
        super.newMetod();
        this.newMetod();
    }
     public String pickUpLabel(){
        String s = "Student's Address: ";
        s += super.getAddress();
        return s;
    }
    
}
