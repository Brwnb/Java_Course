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

        Contato[] contato = new Contato[3];
        for (int i = 0; i < contato.length; i++) {
            Contato c = new Contato();

            c.setName(JOptionPane.showInputDialog("Type the Name of Contact: "));
            c.setPhoneNumber(JOptionPane.showInputDialog("Type the Phone Number of: "));
            c.setEmail(JOptionPane.showInputDialog("Type the E-mail: "));
            contato[i] = c;
        }

        primeira.setContatos(contato);

        JOptionPane.showMessageDialog(null, "The Name of Agenda: " + primeira.getName());

        for (int i = 0; i < primeira.getContatos().length; i++) {
            Contato c = primeira.getContatos()[i];
            JOptionPane.showMessageDialog(null, "The Name of Agenda: " + c.getName()
                    + "\n" + "The contact name: " + c.getEmail()
                    + "\n" + "The Phone number of contact: " + c.getPhoneNumber());

        }
    }
}
