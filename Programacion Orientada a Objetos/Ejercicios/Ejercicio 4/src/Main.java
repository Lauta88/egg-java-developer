import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/*
Ejercicio 4
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Main {
    public static void main(String[] args) {

        ServicioRectangulo servicioRectangulo = new ServicioRectangulo();

        Rectangulo rectangulo1 = servicioRectangulo.crearRectangulo();

        System.out.println("El perimetro del rectangulo es:");
        System.out.println(servicioRectangulo.calcularPerimetro(rectangulo1.getBase(), rectangulo1.getAltura()));

        System.out.println("La superficie del rectangulo es:");
        System.out.println(servicioRectangulo.calcularSuperficie(rectangulo1.getBase(), rectangulo1.getAltura()));

        servicioRectangulo.dibujarRectangulo(rectangulo1);

    }
}