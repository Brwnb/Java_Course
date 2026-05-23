/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula36.e01;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        
        
        Agenda primeira = new Agenda();
        primeira.setName(JOptionPane.showInputDialog("Type the name of agenda: "));
        
        Contato contato = new Contato();
        contato.setName(JOptionPane.showInputDialog("Type the Name of Contact: "));
        contato.setPhoneNumber(JOptionPane.showInputDialog("Type the Phone Number of: "));
        contato.setEmail(JOptionPane.showInputDialog("Type the E-mail: "));
        
        primeira.setContato(contato);
        
        JOptionPane.showMessageDialog(null, "The Name of Agenda: " + primeira.getName()
                + "\n" + "The contact name: " + primeira.getContato().getName()
                + "\n" + "The Phone number of contact: " + primeira.getContato().getPhoneNumber()
                + "\n" + "The email of contact: " + primeira.getContato().getEmail()
         );
    }
}
