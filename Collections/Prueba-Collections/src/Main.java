import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<Libro> libros = new ArrayList();

        Libro libro1 = new Libro("In cold blood", 1962 );
        Libro libro2 = new Libro("Casa tomada", 1988 );
        Libro libro3 = new Libro("La carta robada", 1898 );

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        Collections.sort(libros, Comparadores.compararAnio);
        for (Libro libro:libros) {
            System.out.println(libro);
        }



    }
}