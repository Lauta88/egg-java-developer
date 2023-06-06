/*
Ejercicio 13
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int n  = leer.nextInt();



        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n ; j++) {
                if (i > 1 && i < n - 1  && j > 1 && j < n - 1 ){

                    System.out.print("  ");
                }else {

                    System.out.print(" *");
                }
            }
            System.out.println("");
        }


    }
}