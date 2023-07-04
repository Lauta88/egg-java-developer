package Servicio;

import Entidad.Rectangulo;

import java.util.Scanner;

public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo(){

        System.out.println("Introducir la base del rectangulo");
        int base = leer.nextInt();

        System.out.println("Introducir la altura del rectangulo");
        int altura= leer.nextInt();

        return new Rectangulo(base, altura);
    }

    public int calcularSuperficie(int base, int altura ){
        int superficie = base * altura;
        return superficie;
    }

    public int calcularPerimetro(int base, int altura ){
        int perimetro = base * 2 + altura * 2;
        return perimetro;
    }

    public void dibujarRectangulo(Rectangulo rectangulo){
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
