package Servicio;

import Entidad.Cuadrado;

import java.util.Scanner;

public class ServicioCuadrado {


    Scanner leer = new Scanner(System.in);
    public Cuadrado crearCuadrado(){
        System.out.println("Ingrese el lado");
        int lado = leer.nextInt();

        int area = lado * lado;
        int perimetro = lado * 4;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
        return new Cuadrado(lado);


    }


}
