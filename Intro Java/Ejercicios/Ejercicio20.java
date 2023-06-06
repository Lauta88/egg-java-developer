/*
Ejercicio20
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int n = 3;
        Scanner leer = new Scanner(System.in);


        int matriz[][] = new int[n][n];

        generarMatriz(matriz, n);
        mostrarMatriz(matriz, n);
        comprobarCuadrado(matriz, n);

    }

    public static void generarMatriz(int[][] matriz, int n){
        Scanner leer2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    System.out.println("Ingrese un valor entre el 1 y el 9 para asignar el valor de la posicion " + i + ", " + j);
                    matriz[i][j] = leer2.nextInt();
                    if (matriz[i][j] < 1 || matriz[i][j] > 9 ) {
                        System.out.println("El valor es incorecto ingrese el valor nuevamente");
                    }

                }while(matriz[i][j] < 1 || matriz[i][j] > 9  );




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

    public static void comprobarCuadrado(int[][] matriz, int n){

        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal1;
        int sumaDiagonal2;

        for (int i = 0; i < n; i++) {
            sumaFila = 0;
            for (int j = 0; j < n; j++) {
               sumaFila = sumaFila + matriz[i][j];
            }
        }

        for (int j = 0; j < n; j++) {
            sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna = sumaColumna + matriz[i][j];
            }
        }

        sumaDiagonal1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    sumaDiagonal1 = sumaDiagonal1 + matriz[i][j];
                }
            }
        }

        sumaDiagonal2 = 0;
        int j = n -1;
        for (int i = 0; i < n; i++) {
            sumaDiagonal2 = sumaDiagonal2 + matriz[i][j];
            j--;
        }

        if(sumaColumna == sumaFila && sumaColumna == sumaDiagonal1 && sumaColumna == sumaDiagonal2 && sumaFila == sumaDiagonal1 && sumaFila == sumaDiagonal2 && sumaDiagonal1 == sumaDiagonal2){
            System.out.println("La martriz es magica y la suma es: " + sumaColumna);
        }else{
            System.out.println("La matriz no es magica");
        }

    }


}
