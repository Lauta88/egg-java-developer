/*
Ejercicio 15
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */



public class Ejercicio15 {
    public static void main(String[] args) {

    int[] vector = new int [100];

    asignarVector(vector);

    mostarVector(vector);

    }

    public static void asignarVector (int[] vector){
        for (int i = 0; i <= 99; i++) {
            vector[i] = i  + 1;
            }
    }

    public static void mostarVector(int[] vector){

        for (int i = 99; i >= 0 ; i--) {
            System.out.println(vector[i]);
        }

    }

}