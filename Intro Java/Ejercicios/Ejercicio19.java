/*
Ejercicio19
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int matriz[][] = new int[n][n];

        generarMatriz(matriz, n);
        mostrarMatriz(matriz, n);
        comprobarAntisimetria(matriz, n);

    }

    public static void generarMatriz(int[][] matriz, int n){
        Scanner leer2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese los valores de la posicion " + i + ", " + j);
                matriz[i][j] = leer2.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");;
            }
            System.out.println("");
        }
    }

    public static void comprobarAntisimetria(int[][] matriz, int n){
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]){
                    flag = true;
                }
            }
        }
        if (flag){
            System.out.println("la matriz no es antisimetrica");
        } else{
            System.out.println("la matriz es antisimetrica");
        }
    }


}
