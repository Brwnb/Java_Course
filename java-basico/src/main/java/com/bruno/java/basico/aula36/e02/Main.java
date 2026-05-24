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
        
        Double[] grade = new Double[4];
        Student[] student = new Student[3];
        for (int i=0;i<student.length;i++){
            Student s = new Student();
            s.setName(JOptionPane.showInputDialog("Student's Name: "));
            s.setRegistration(JOptionPane.showInputDialog("Registration code: "));
            
            for (int j=0;j<4;j++){
                grade[j] = Double.valueOf(JOptionPane.showInputDialog("Student " + s.getName() + "'s grade: "));
            }
            s.setGrades(grade);
            student[i]= s;
            course.setStudents(student);
        }
        

        
        JOptionPane.showMessageDialog(null,
                "Course Name: " + course.getName()
                + "\n" + "Hour: " + course.getHour()
                + "\n" + "Professor's name: " + course.getProfessor().getName()
                + "\n" + "Professor's Department: " + course.getProfessor().getDepartment());
        
        double average_class = 0;
        for(int i=0;i<course.getStudent().length;i++){
            Student s = course.getStudent()[i];
            average_class += s.average();
            JOptionPane.showMessageDialog(null, "Student's Name: " + s.getName()
                    + "\n" + "Registration code: " + s.getRegistration()
                    + "\n" + "Grade: " 
                    + "\n" + "Exam 1: " + s.getGrades()[0]
                    + "\n" + "Exam 2: " + s.getGrades()[1]
                    + "\n" + "Exam 3: " + s.getGrades()[2]
                    + "\n" + "Exam 4: " + s.getGrades()[3]
                    + "\n" + "Average: " + s.average()
                    + "\n" + "Average: " + s.validation(s.average())
                    
            );
            
        }
        JOptionPane.showMessageDialog(null, "Average of the Class" + average_class/3);
      
    }
}
