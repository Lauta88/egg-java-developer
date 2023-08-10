import java.util.Comparator;

public class Comparadores {
    public static Comparator<Libro> compararAnio = new Comparator<Libro>() {
        @Override
        public int compare(Libro o1, Libro o2) {

         return o2.getAnio().compareTo(o1.getAnio());
        }
    };
}
