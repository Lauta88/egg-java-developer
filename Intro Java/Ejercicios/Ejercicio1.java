/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/

package com.mycompany.guiateorica;

import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {
   
        Scanner leer = new Scanner (System.in);
        
        int numero1;
        int numero2;        
        int suma;
        
        System.out.println("Ingrese un numero entero");
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero entero para sumarlo");
        numero2 = leer.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.println("La suma de los dos numeros ingresados es: " + suma);
        
    }
    
}
