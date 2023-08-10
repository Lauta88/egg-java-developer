/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicio {
    Scanner leer = new Scanner(System.in);

    HashMap<String, Double> productos = new HashMap<>();

    public void menuProducto(){


        int opcion;
        do {
            System.out.println("1. Ingresar por producto");
            System.out.println("1. Modificar precio de un producto");
            System.out.println("1. Eliminar un producto");
            System.out.println("1. Mostrar un producto");
            opcion = leer.nextInt();

        } while(opcion != 0);
    }

}
