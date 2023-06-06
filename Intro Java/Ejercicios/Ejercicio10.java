/*Ejercicio 8
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese un valor numererico para establecer un limite");
        int limite = leer.nextInt();

        int suma = 0;

        while (suma <= limite){
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
             suma = suma + numero;
        }


    }
}