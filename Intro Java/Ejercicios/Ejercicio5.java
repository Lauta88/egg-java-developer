/*
Ejercicio5
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package com.mycompany.guiateorica;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        
        int numero = leer.nextInt();
        double numeroConvertido = numero;
        
        System.out.println("El doble de " + numero + " es: " + numero * 2);
        System.out.println("El triple de " + numero + " es: " + numero * 3);
        System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numeroConvertido));
        
    }
    
}
