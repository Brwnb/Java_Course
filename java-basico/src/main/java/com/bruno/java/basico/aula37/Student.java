/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula37;

import java.util.Arrays;
import java.util.Objects;

public class Student extends People {
  
    private String courses;
    private double[] grade;

    public Student() {
        super();
    }

    public Student(String name, String address, String phone) {
        super(name, address, phone);
    }

    public Student(String courses, String name, String address, String phone) {
        super(name, address, phone);
        this.courses = courses;
    }

    
    public String getCourses() {
        return courses;
    }

    public double[] getGrade() {
        return grade;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public void setGrade(double[] grade) {
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
     /*
    public String toString(){
       String s = courses + "\n";
       for (double grades : grade){
           s += grades + " ";
       }
       return s;
    }
    */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("courses=").append(courses);
        sb.append(", grade=").append(Arrays.toString(grade));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.courses, other.courses)) {
            return false;
        }
        return Arrays.equals(this.grade, other.grade);
    }
    
    
     
}
