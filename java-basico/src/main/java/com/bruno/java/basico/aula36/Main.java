/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula36;

import javax.swing.JOptionPane;

/*
 *Relation between classes
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //An instance of Contact class
        Contact user = new Contact();
        user.setName("Tarnish");
        //user.setAddress("Street 4, Looner Ville"); // Before of the Address class
        //user.setPhoneNumber("66 66666-6666"); //Before of PhoneNumber class

        //An instace of PhoneNumber class
        PhoneNumber phone = new PhoneNumber();
        phone.setCode("+666");
        phone.setType("mobile");
        phone.setNumber("66666-6666");

        //Second instace of PhoneNumber class
        PhoneNumber phone2 = new PhoneNumber();
        phone2.setCode("+121212");
        phone2.setType("home");
        phone2.setNumber("12121-1212");

        PhoneNumber[] array = new PhoneNumber[2];
        array[0] = phone;
        array[1] = phone2;

        // An instace os Address class
        Address location = new Address();
        location.setStreetName("Street 6");
        location.setAddressLine2("66");
        location.setCity("New York City");
        location.setCountry("United States of America");
        location.setState("New York");
        location.setZipCode("6666-66");

        //set the address to Contact class
        user.setAddress(location);
        //Set the phone details to Contact class
        //user.setPhoneNumber(phone); //one-to-one relation
        user.setPhoneNumbers(array);

        /*
        if(user.getAddress() != null && user.getPhoneNumber() != null){
            JOptionPane.showMessageDialog(null, 
                "Name: " + user.getName() + 
                "\n" + "City: " + user.getAddress().getCity() +
                "\n" + "Country: " +user.getAddress().getCountry() +
                "\n" + "Phone: " + user.getPhoneNumber().getNumber());
        }
         */
 /*
        if I forgot to set the location we will get a NullPointerException
        JOptionPane.showMessageDialog(null, user.getName() + 
                "\n" + user.getAddress().getCity() +
                "\n" + user.getAddress().getCountry() +
                "\n" + user.getPhoneNumber());
       
        }*/
        for(PhoneNumber p : user.getPhoneNumbers()){
            System.out.println(p.getNumber());
        }
        if (user.getAddress() != null && user.getPhoneNumbers() != null) {
            JOptionPane.showMessageDialog(null,
                    "Name: " + user.getName()
                    + "\n" + "City: " + user.getAddress().getCity()
                    + "\n" + "Country: " + user.getAddress().getCountry()
                    + "\n" + "Phones: " + user.getPhoneNumbers()[0].getNumber()
                    + "\n" + "Phones: " + user.getPhoneNumbers()[1].getNumber());
        }
    }
}
