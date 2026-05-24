/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.bruno.java.basico.aula36.e02;


public class Student {
    private String name;
    private String registration;
    private Double[] grades;

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }

    public Double[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setGrades(Double[] grades) {
        this.grades = grades;
    }

    public double average(){
        double sum = 0;
        for (double grade : this.grades){
            sum += grade;
        }
        return sum/4;
    }
    
    public String validation(double value){
        if (value >= 7.0){
            return "Approved";
        }
        else{
            return "Reproved";
        }
    }
  
}
