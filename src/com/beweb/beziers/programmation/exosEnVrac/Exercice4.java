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

//La valeur de la variable est 2.
public class Exercice4 {
    
    public  static void launch(){
        
        boolean flag = false;
        int i = 0;
        //Condition fausse incremente.
        if(flag==false){
            i++;
            System.out.println("C'est faux !"+i);
         //Condition vrai decremente.   
            if(flag==true){
            i--;
            System.out.println("C'est vrai ! "+i);
        }
        else 
        System.out.println();
        
        
        }
        //Changer valeur de la variable booleene et incremente si vrai
        flag=true;
        
        
        if(flag==true){
            i++;
            System.out.println("C'est vrai ! "+i);
            if (flag==false){
                i--;
                System.out.println("C'est faux ! "+i);
                
            }
        }
         
    }   
    
    
    
}
