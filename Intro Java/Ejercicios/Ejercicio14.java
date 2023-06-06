/*
Ejercicio 14
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);

        System.out.println("Ingrese el monto que desea convertir");
        int monto = leer.nextInt();

        System.out.println("Ingrese a que moneda desea convertirlo (Dolares, Yenes o Libras )");
        String moneda = leer2.nextLine();

        moneda = moneda.toLowerCase();
        convertirEuros(monto, moneda);


    }

    public static void convertirEuros(int monto, String moneda){

        switch (moneda){
            case "dolares":
                System.out.println("La conversion de " + monto + " euros" + " a " + moneda + " es igual a " +  monto * 1.07);
                break;
            case "libras":
                System.out.println("La conversion de " + monto + " euros" + " a " + moneda + " es igual a " +  monto * 0.86);
                break;
            case "yenes":
                System.out.println("La conversion de " + monto + " euros" + " a " + moneda + " es igual a " +  monto * 149.83);
                break;
        }
    }
}