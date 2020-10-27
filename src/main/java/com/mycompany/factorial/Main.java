/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorial;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main ( String [] args ){
        Numero objetoNum = new Numero();
        Scanner leer = new Scanner (System.in);
        int dato; // variable que se usa para mandar el dato al metodo.
        int metodoFactorial; // variable para mandar a llamar a la función.
        System.out.println("Ingrese un numero para calcular su factorial");
        dato=leer.nextInt();
        metodoFactorial=objetoNum.FactorialRecursivo(dato);
        System.out.println("El Numero ingresado fue: " + dato + "  El Resultado del Factorial es: " + metodoFactorial); // muestro los valores de n factorial.
    }   
}