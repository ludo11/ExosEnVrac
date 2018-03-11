/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac;

/**
 *
 * @author ludo
 */
public class Exercice10 {
    public  static void launch(){
        //Affiche les 100 premiers nombres de la suite de Fibonacci
        long i = 0;
        long j = 1;
        long temp;
        int n = 100;
            //boucle qui incremente 
            for (int k = 0; k < n; k++) {
                
                temp = i + j;
                i = j;
                j = temp;
            System.out.println(i);
            }
                
    }
    
}
