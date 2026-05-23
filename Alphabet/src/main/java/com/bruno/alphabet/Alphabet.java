
package com.bruno.alphabet;

/*
 * This code is to practice a way to write the alphabet
 * using ansii insted to type all the letters on array
 *
 * I have done this on the collage, and I need to search
 * Because I didn't remeberer. It was a long, long time
 * go. 
 */

public class Alphabet {

   
    public static void main(String[] args) {

        // One way to generate the alphabet
        /*
        int count=0;
        char[] alphabet = new char[26];
        for(char c = 'A'; c <= 'Z'; c++){
            alphabet[count] = c;
            count++;
        }
        for (int i=0;i<alphabet.length;i++){
            System.out.print(alphabet[i] + " ");
        }
         */
        
        // A second way to generate the alphabet
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        
        for (char letter : alphabet){
            System.out.print( letter + " ");
            
        }
        // There is a lot of ways to generate an alphabet
        //System.out.print((char) 'a' - 32);
    }
}
