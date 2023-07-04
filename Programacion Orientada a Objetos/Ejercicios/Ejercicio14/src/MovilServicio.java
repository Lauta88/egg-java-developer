import java.sql.SQLOutput;
import java.util.Scanner;

/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
public class MovilServicio {

    Scanner leer = new Scanner(System.in);
    public Movil cargarCelular(){

        Movil movil = new Movil();

        System.out.println("Ingrese la marca del movil");
        movil.setMarca(leer.nextLine());
        System.out.println("Ingrese el precio");
        movil.setPrecio(leer.nextInt());
        System.out.println("Ingrese el modelo");
        leer.nextLine();
        movil.setModelo(leer.nextLine());
        System.out.println("Ingrese la memoria ram");
        movil.setMemoiaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamieno");
        movil.setAlmacenamiento(leer.nextInt());

        return movil;
    }

    public void ingresarCodigo(Movil movil){
        int[] codigo = movil.getCodigo();
        for (int i = 0; i < movil.getCodigo().length; i++) {
            System.out.println("Ingrese un numero");
            codigo[i] = leer.nextInt();
        }
        movil.setCodigo(codigo);
    }

}
