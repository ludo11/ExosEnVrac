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
public class Exercice8 {
    public  static void launch(){
        //boucle qui compte jusqu'au nombre 243
        int nb = 243;
        for(int i=0 ; i<nb ;nb--){
            
           
                //si pair affiche les valeur pair
                if((nb%2)==0){
                System.out.println(nb+ " Valeur pair");
                }
                //si multiple de 5 affiche les valeurs
                else if((nb%5)==0){
                    System.out.println(nb+ " Multiple de 5");
                
                }
                //si multiple de 10 affiche les valeurs
                if((nb%10)==0){
                    System.out.println(nb+ " Multiple de 10");
                }
        }
    }
}
        
        
    
    

