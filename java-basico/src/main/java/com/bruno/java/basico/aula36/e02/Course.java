/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.bruno.java.basico.aula36.e02;

import java.time.LocalTime;



public class Course {
    private String name;
    private LocalTime hour;
    private Professor professor;
    private Student[] students;

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Student[] getStudent() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setStudents(Student[] student) {
        this.students = student;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }
    
}
