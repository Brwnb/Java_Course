/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula36.e02;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Course course = new Course();

        course.setName(JOptionPane.showInputDialog("Name of course: "));
        course.setHour(LocalTime.parse(JOptionPane.showInputDialog("Hour of course: ")));

        Professor professor = new Professor();
        professor.setName(JOptionPane.showInputDialog("Professor Name: "));
        professor.setDepartment(JOptionPane.showInputDialog("Department: "));
        professor.setEmail(JOptionPane.showInputDialog("Professor's email: "));

        course.setProfessor(professor);

        Student student1 = new Student();
        student1.setName(JOptionPane.showInputDialog("Student's Name: "));
        student1.setRegistration(JOptionPane.showInputDialog("Registration code: "));

        String[] grades = new String[5] ;
        for (int i = 0; i < grades.length; i++) {
            grades[i] = JOptionPane.showInputDialog("Student's grade: ");
        }

        student1.setGrades(grades);
        course.setStudent(student1);
     
        JOptionPane.showMessageDialog(null,
                "Course Name: " + course.getName()
                + "\n" + "Hour: " + course.getHour()
                + "\n" + "Country: " + course.getProfessor().getName()
                + "\n" + "Country: " + course.getProfessor().getDepartment()
                + "\n" + "Phones: " + course.getStudent().getName()
                + "\n" + "Phones: " + course.getStudent().getRegistration());
                
        for(String s : course.getStudent().getGrades()){
            JOptionPane.showMessageDialog(null, "Grades: " + s);
        }
        
    }
}
