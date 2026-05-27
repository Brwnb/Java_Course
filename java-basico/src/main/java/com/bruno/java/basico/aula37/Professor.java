/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula37;

public class Professor extends People {

    private String department;
    private String[] courses;
    private double salary;

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double CalcSalaryliquid() {
        return 5;
    }

    @Override
    public String pickUpLabel() {
        String s = "Professor's Address: ";
        s += super.getAddress();
        return s;
    }
  //  String A= "ABC" + 3.45;
}
