package Servicios;

import Entidad.Libro;
import java.util.Scanner;

public class ServicioLibro {

    private Scanner leer = new Scanner(System.in);
    public Libro cargarLibro(){

        System.out.println("Introducir ISBN del libro");
        String isbn = leer.next();

        System.out.println("Introducir el titulo del libro");
        String titulo = leer.next();

        System.out.println("Introducir el autor del libro");
        String autor = leer.next();

        System.out.println("Introducir la cantidad de paginas del libro");
        int numeroPaginas = leer.nextInt();

        return new Libro(isbn, titulo, autor, numeroPaginas);
    }


}
