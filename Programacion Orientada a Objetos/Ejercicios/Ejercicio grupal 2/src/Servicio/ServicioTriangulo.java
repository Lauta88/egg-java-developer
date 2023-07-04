package Servicio;


import Entidad.Triangulo;

import java.util.Scanner;

public class ServicioTriangulo {

    Scanner leer = new Scanner(System.in);
    public Triangulo crearTriangulo() {
        System.out.println("Ingrese un lado del triangulo equilatero");
        int lado = leer.nextInt();



        double area = (Math.sqrt(3) * lado) / 2 ;
        int perimetro = lado * 3;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
        return new Triangulo(lado);

    }
}
