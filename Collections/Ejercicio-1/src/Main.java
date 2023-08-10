import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList<>();

        int opcion = 1 ;
        while(opcion != 0){
            System.out.println("1.Ingresar raza");
            System.out.println("2. Mostrar razas Ingresadas");
            System.out.println("0. Salir");
            opcion = leer.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("ingrese una raza de perro");
                    leer.nextLine();
                    String ingreso = leer.nextLine();
                    razas.add(ingreso);
                    break;
                case 2:
                    for (String raza: razas) {
                        System.out.println(raza);
                    }
                    break;
                case 0:
                    break;

            }


        }

    }
}