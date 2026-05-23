/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.bruno.java.basico.aula36;

/*
* Relation between classes one-to-many
*/

public class PhoneNumber {
    private String type;
    private String code;
    private String number; 

    public void setType(String type) {
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }
    
    
}