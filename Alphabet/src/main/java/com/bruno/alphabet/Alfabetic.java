
package com.bruno.alphabet;


public class Alfabetic {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

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
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        
        for (char letter : alphabet){
            System.out.print( letter + " ");
            
        }
        System.out.print((char) 'a' - 32);
    }
}
