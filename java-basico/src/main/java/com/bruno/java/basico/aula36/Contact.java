/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.bruno.java.basico.aula36;

/*
* We are useing array to work with many phone number insted of colletions just
* because we don't see colletions yet.
*/
public class Contact {
   
    private String name;
    private Address address;
   // private PhoneNumber phoneNumber; // before, when the class was one-to-one
    private PhoneNumber[] phoneNumbers;

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    
    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }
    
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    /*
    public PhoneNumber getPhoneNumber() { // before, when the class was one-to-one
        return phoneNumber;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

   /*
    public void setPhoneNumber(PhoneNumber phoneNumber) { // before, when the class was one-to-one
        this.phoneNumber = phoneNumber;
    }
    */
}
