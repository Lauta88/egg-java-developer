/*
Ejercicio 4
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package com.mycompany.guiateorica;

import java.util.Scanner;


public class Ejercicio4 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura en grados centigrados para convertirla a fahrenheit");
        double tempCentigrados = leer.nextDouble();
        
        double tempFahrenheit = 32 + (9 * tempCentigrados / 5);
        
        System.out.println("El equivalente en grados fahrenheit es: " + tempFahrenheit);
    }
    
}
