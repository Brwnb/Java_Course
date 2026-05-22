/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.java.basico.aula35;

/**
 *
 * @author 
 */
public class Calculadora {
    
    public static int fatorial(int num){
        
        if (num == 0){
            return 1;
        }
        return num * fatorial(num - 1);
    }
    
}
