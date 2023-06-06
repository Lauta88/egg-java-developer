/*
Ejercicio 17
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
import java.util.Scanner;



public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero pero determinar el tamaño del vector");
        int n = leer.nextInt();


        int[] vector = new int [n];

        asignarVector(vector, n);

        mostrarVector(vector, n);

        contarDigitos(vector, n);


    }

    public static void asignarVector (int[] vector, int n){
        for (int i = 0; i <= n - 1; i++) {
            vector[i] = (int)(Math.random()*100);
        }
    }

    public static void mostrarVector(int[] vector, int n){

        for (int i = 0; i <=  n - 1 ; i++) {
            System.out.println(vector[i]);
        }

    }

    public static void contarDigitos(int[]vector, int n){
        int numero;
        int digitos;
        int unDigito = 0;
        int dosDigitos = 0;
        for (int i = 0; i <= n - 1; i++) {

            numero = vector[i];
            digitos = Integer.toString(numero).length();

            if(digitos == 2){
                dosDigitos += 1;

            }else{
                unDigito += 1;
            }


        }
        System.out.println("numeros de un digito " + unDigito);
        System.out.println("numeros de dos digito " + dosDigitos);
    }




}