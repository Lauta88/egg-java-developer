/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculasServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void ingresarPelicula(){

        int opcion = 1;
        while (opcion != 0){
            System.out.println("1. Ingresar Pelicula");
            System.out.println("0. Salir");
            opcion = leer.nextInt();

            if(opcion == 1){

                System.out.println("Ingrese el nombre de la pelicula");
                leer.nextLine();
                String nombre = leer.nextLine();
                System.out.println("Ingrese el nombre del director");
                String director = leer.nextLine();
                System.out.println("Ingrese la duracion de la pelicula");
                Double duracion = leer2.nextDouble();

                Pelicula pelicula = new Pelicula(nombre, director, duracion);
                peliculas.add(pelicula);
            }
        }

        opcion = 1;
        while(opcion != 0){
            System.out.println("1. Mostrar todas las peliculas");
            System.out.println("2. Mostrar todas las peliculas con duracion mayor a una hora");
            System.out.println("3. Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.");
            System.out.println("4. Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.");
            System.out.println("5. Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.");
            System.out.println("6. Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    mostrarPeliculas();
                    break;
                case 2:
                    mostrarPeliculasDeMasUnaHora();
                    break;
                case 3:
                    ordenarDeMayorAmenor();
                    break;
                case 4:
                    ordenarDeMenorAmayor();
                    break;
                case 5:
                    ordenarPorTitulo();
                    break;
                case 6:
                    ordenarPorDirector();
                    break;
                case 0:
                    break;
            }
        }
    }

    public void mostrarPeliculas(){
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getTitulo() + ", Duracion: " + pelicula.getDuracion() + "hs"  );
            }
        }
    public void mostrarPeliculasDeMasUnaHora(){
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getDuracion() > 1){
                System.out.println("Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getTitulo() + ", Duracion: " + pelicula.getDuracion() + "hs"  );
            }
        }
    }

    public void ordenarDeMayorAmenor(){

        Collections.sort(peliculas, Comparadores.ordenarDuracionMayorAmenor);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getTitulo() + ", Duracion: " + pelicula.getDuracion() + "hs"  );
        }
    }

    public void ordenarDeMenorAmayor(){

        Collections.sort(peliculas, Comparadores.ordenarDuracionMenorAMayor);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getTitulo() + ", Duracion: " + pelicula.getDuracion() + "hs"  );
        }
    }

    public void ordenarPorTitulo(){

        Collections.sort(peliculas, Comparadores.tituloAlfabeticamente);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getTitulo() + ", Duracion: " + pelicula.getDuracion() + "hs"  );
        }
    }

    public void ordenarPorDirector(){

        Collections.sort(peliculas, Comparadores.directorAlfabeticamente);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getTitulo() + ", Duracion: " + pelicula.getDuracion() + "hs"  );
        }
    }

}
