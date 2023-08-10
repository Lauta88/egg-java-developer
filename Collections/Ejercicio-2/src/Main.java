import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList<>();


        int opcion = 1 ;
        while(opcion != 0){
            System.out.println("---------------");
            System.out.println("1.Ingresar raza");
            System.out.println("2. Mostrar razas Ingresadas");
            System.out.println("3. Eliminar raza");
            System.out.println("0. Salir");
            System.out.println("---------------");
            opcion = leer.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("ingrese una raza de perro");
                    leer.nextLine();
                    String ingreso = leer.nextLine();
                    razas.add(ingreso);
                    break;
                case 2:
                    Collections.sort(razas);
                    for (String raza: razas) {
                        System.out.println(raza);

                    }
                    break;
                case 3:
                    Iterator<String> it = razas.iterator();
                    System.out.println("Ingrese una raza para eliminarla");
                    leer.nextLine();
                    String razaBuscada = leer.nextLine();
                    boolean encontrada = false;
                    while(it.hasNext()){
                        if(it.next().equals(razaBuscada)){
                            it.remove();
                            System.out.println("se elimino la raza de la lista");
                            encontrada = true;
                        }
                    }
                    if(!encontrada){
                        System.out.println("La raza no se encontro");
                    }
                case 0:
                    break;
            }
        }

    }
}