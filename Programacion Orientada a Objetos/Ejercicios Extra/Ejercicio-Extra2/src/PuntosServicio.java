import java.util.Scanner;

/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

d(P1,P2)=√(x2−x1)2+(y2−y1)2
 */
public class PuntosServicio {

    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){

        Puntos punto = new Puntos();

        System.out.println("Ingrese la cordenada x del primer punto");
        punto.setX1(leer.nextInt());
        System.out.println("Ingrese la cordenada y del primer punto");
        punto.setY1(leer.nextInt());

        System.out.println("Ingrese la cordenada x del segundo punto");
        punto.setX2(leer.nextInt());
        System.out.println("Ingrese la cordenada y del segundo punto");
        punto.setY2(leer.nextInt());

        return punto;

    }

    public void calcularDistancia(Puntos punto){
         double distancia = Math.sqrt(Math.pow(punto.getX2() - punto.getX1(), 2) + Math.pow(punto.getY2() - punto.getY1(), 2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}
