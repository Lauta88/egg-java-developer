/* Ejercicio 3
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package com.mycompany.guiateorica;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {

       Scanner leer = new Scanner(System.in);
       
       
        System.out.println("Ingrese una frase utilizando minusculas y mayosculas");
       String frase = leer.nextLine();
       
       String fraseMinuscula = frase.toLowerCase();
       String fraseMayuscula = frase.toUpperCase();
       
        System.out.println("Tu frase en minusculas es:");
        System.out.println(fraseMinuscula);
        
        System.out.println("Tu frase en mayusculas es:");
        System.out.println(fraseMayuscula);
       
        
    }
    
}
