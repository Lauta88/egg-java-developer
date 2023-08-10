import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
Ejercicio 5
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
public class PaisServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> paises = new HashSet<>();


    public void ingresarPais() {

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("1. Ingresar Pais");
            System.out.println("0. Salir");
            opcion = leer.nextInt();


            if (opcion == 1) {

                System.out.println("Ingrese el nombre del pais");
                leer.nextLine();
                String nombrePais = leer.nextLine();

                paises.add(new Pais(nombrePais));

            }
        }
        ArrayList<Pais> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados, Comparadores.alfabeticamente);
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombre());
        }
    }

    public void buscarYeliminarPais(){
        System.out.println("Ingrese un pais");
        leer.nextLine();
        String paisElegido = leer.nextLine();

        for (Pais pais : paises) {
            if(pais.getNombre().equalsIgnoreCase(paisElegido)){
                paises.remove(pais);
            }

        }
        ArrayList<Pais> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados, Comparadores.alfabeticamente);
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombre());
        }
    }


}
