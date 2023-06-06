/*
Ejercicio11
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        int resultado;
        int opcion;
        boolean confirmarSalida = false;
        while(!confirmarSalida){
            System.out.println("MENU\n" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Salir\n" +
                    "Elija opción:");

            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de " + num1 + " + " + num2 + " es " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de " + num1 + " - " + num2 + " es " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de " + num1 + " * " + num2 + " es " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado de " + num1 + " / " + num2 + " es " + resultado);
                    break;
                case 5:

                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    Scanner leer2 = new Scanner(System.in);
                    String salida = leer2.nextLine();
                    if (salida.equalsIgnoreCase("s")){
                        confirmarSalida = true;
                    }


        }


        }
    }
}