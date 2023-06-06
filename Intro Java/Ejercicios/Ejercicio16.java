/*
Ejercicio 16
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */


import java.util.Scanner;



public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero pero determinar el tamaño del vector");
        int n = leer.nextInt();

        System.out.println("Ingrese un numero para buscarlo dentro del vector");
        int numBuscar = leer.nextInt();

        int[] vector = new int [n];

        asignarVector(vector, n);

        mostrarVector(vector, n);

        buscarNumero(vector, n, numBuscar);

    }

    public static void asignarVector (int[] vector, int n){
        for (int i = 0; i <= n - 1; i++) {
            vector[i] = (int)(Math.random()*10);
        }
    }

    public static void mostrarVector(int[] vector, int n){

        for (int i = 0; i <=  n - 1 ; i++) {
            System.out.println(vector[i]);
        }

    }

    public static void buscarNumero(int[]vector, int n,  int numBuscar){
        int vecesEncontrado = 0;
        for (int i = 0; i <= n - 1; i++) {
           if (vector[i] == numBuscar){
               vecesEncontrado += 1;
               System.out.println("El numero " + numBuscar + " se encuentra en la poisicion "+ i + " del vector");
           };
        }
        System.out.println("E numero " + " se envuentra " + vecesEncontrado + " veces en el vector");
    }




}