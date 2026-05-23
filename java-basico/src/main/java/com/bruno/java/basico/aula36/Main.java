/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula36;

import javax.swing.JOptionPane;

// Relation between classes
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Contact user = new Contact();
        user.setName("Tarnish");
        //user.setAddress("Street 4, Looner Ville");
        user.setPhoneNumber("66 66666-6666");
        
        Address location = new Address();
        location.setStreetName("Street 4");
        location.setAddressLine2("67");
        location.setCity("New York City");
        location.setCountry("United States of America");
        location.setState("New York");
        location.setZipCode("6666-66");
        
        user.setAddress(location);
        
        if(user.getAddress() != null){
            JOptionPane.showMessageDialog(null, user.getName() + 
                "\n" + user.getAddress().getCity() +
                "\n" + user.getAddress().getCountry() +
                "\n" + user.getPhoneNumber());
        }
        
      /*
        if I forgot to set the location we will get a NullPointerException
        JOptionPane.showMessageDialog(null, user.getName() + 
                "\n" + user.getAddress().getCity() +
                "\n" + user.getAddress().getCountry() +
                "\n" + user.getPhoneNumber());
       */
}
}
