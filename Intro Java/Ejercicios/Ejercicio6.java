/*
Ejercicio6
 Crear un programa que dado un numero determine si es par o impar.
 */
package com.mycompany.guiateorica;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
       
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para saber si es par o impar");
        int numero = leer.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El numero " + numero + " es par" );
        }else{
            System.out.println("El numero " + numero + " es impar" );
        }
    }
    
}
