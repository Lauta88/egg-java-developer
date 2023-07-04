import java.util.Arrays;

/*
ejercicio 10
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[50];
        int[] array2 = new int[20];


        for (int i = 0; i < array1.length; i++) {

            array1[i] = (int)(Math.random()*100);

            System.out.println(array1[i]);
        }

        Arrays.sort(array1);

        for (int i = 0; i < array1.length; i++) {

            System.out.println(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {

           if (i <= 10){
               array2[i] = array1[i];
           } else {
               array2[i] = 5;
           }

            System.out.println(array2[i]);
        }

    }
}