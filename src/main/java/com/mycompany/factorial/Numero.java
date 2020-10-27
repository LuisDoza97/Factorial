/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorial;

/**
 *
 * @author Admin
 */


public class Numero {
    
    // Creando Método Factorial Recursivo 
    public int FactorialRecursivo(int num){
        if (num<=0){
            return 1; 
        }else{
            // Caso Base Recursivo
        return ( num* FactorialRecursivo (num-1) ); // Manda a llamar los factoriales del valor del numero ingresado RECURSIVAMENTE.   
        }
    }  
}