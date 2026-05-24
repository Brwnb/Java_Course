/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula37;

/**
 *
 *
 */
public class Student {
    private String name;
    private String address;
    private String phone;
    private String id;
    private String[] courses;
    private String[][] grade;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }

    public String[] getCourses() {
        return courses;
    }

    public String[][] getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(String id) {
        this.id = id;
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
    
}
