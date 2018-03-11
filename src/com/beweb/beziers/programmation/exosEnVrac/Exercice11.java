/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac;

import java.util.Arrays;

/**
 *
 * @author ludo
 */
public class Exercice11 {
    public  static void launch(){
        //je suis rester bloquer :(
        long suite[]= new long[1000];
        long nombrespairs[]= new long[10];
        long multiplesdecinq[]= new long[10];
        long nombresimpairs[]= new long[10];
        long multiplesdetroix[]= new long[10];
        
        long i = 0;
        long j = 1;
        long temp;
        int n = 1000;
            for (int k = 0; k < n; k++) {
                temp = i + j;
                i = j;
                j = temp;
                 suite[k]=+j;
                
            }
        
        
        
        
    }
    
}
