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
public class Exercice9 {
    public  static void launch(){
        int nb = 243;
        int res =0;
        //boucle qui decremente le nombre
        for(int i=0 ; i<nb ;nb--){
                //si valeur multiple de 10 ajout la valeur precedente
                if((nb%10)==0){
                   
                
                       System.out.println(" Ajout de la valeur precedente " + (nb+10 + nb) ); 
                     
                     
                }
                // si pair ajoute la valeur suivante
                if((nb%2)==0){
                   
                
                       System.out.println(" Si pair Ajout de la valeur suivante " + (nb+2 + nb) ); 
                }     
                //si multiple de 5 et multiple de 3
                if((nb%5==0)&&(nb%3==0)){
                   
                
                       System.out.println(nb +  " vrai multiple de 3 et 5  "    ); 
                }    
                
               
        }
                
               
        
        
        
    }
}  

