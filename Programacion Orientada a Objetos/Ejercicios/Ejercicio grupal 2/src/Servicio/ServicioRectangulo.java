package Servicio;

import Entidad.Cuadrado;
import Entidad.Rectangulo;

import java.util.Scanner;

public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base");
        int base = leer.nextInt();

        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();

        int area = base * altura;
        int perimetro = base * 2 + altura * 2;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
        return new Rectangulo(base, altura);

        }

    }
