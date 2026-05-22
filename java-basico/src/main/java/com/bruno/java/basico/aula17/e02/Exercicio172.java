/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bruno.java.basico.aula17.e02;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Exercicio172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Type your user: ");
            String username = scan.nextLine();
            System.out.println("Type your password: ");
            String password = scan.nextLine();
            
            
            if ( username.isBlank() || password.isBlank()){
            
                System.out.println("user or passowrd is blank!!!");
            }else {
                if (username.equals(password)) {
                    System.out.println("The user and password can't be the same");
                } else {
                    System.out.println("Login with success!!!");
                    break;
                    
                }
            }
        }  
    }

   
}
