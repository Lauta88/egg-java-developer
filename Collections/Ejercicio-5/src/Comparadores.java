import java.util.Comparator;

public class Comparadores {


    public static Comparator<Pais> alfabeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {

            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}
