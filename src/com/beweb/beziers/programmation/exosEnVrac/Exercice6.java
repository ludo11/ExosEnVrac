/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ludo
 */
public class Exercice6 {
     public  static void launch(){
       //declaration et initialisation booleen
       boolean vrai= true;
       boolean faux= false;
       boolean []tab= new boolean[10];
       
       int i=0;
       //boucle qui fait la longueur du tableau true
       while(i<=tab.length-1){
           
           System.out.println(vrai+" = " +i);
           i++;
         
       }
       
     

       int j = 0;
       //boucle qui parcour longueur du tableau false
        while(j<=tab.length-1){
           
           System.out.println(faux+" = " +j);
           j++;
           
           
       }
       //boucle qui affiche les true et false 
        int a = 0;
        int b = 0;
        while(++a<=tab.length-1){
         
           
             while(++b<=tab.length-1){
                if(b%2==0){
                    System.out.print(vrai+"-");
                }else{
                    System.out.print(faux+"-");
                }
           
                   }
           
           System.out.println("");
        }
       
   }
}
        
         
         
         
     
    
