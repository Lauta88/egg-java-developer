package Servicio;

import Entidad.Circulo;


import java.util.Scanner;

public class ServicioCirculo {


    Scanner leer = new Scanner(System.in);
    public Circulo crearCirculo(){
        System.out.println("Ingrese el radio");
        int radio = leer.nextInt();

        double area = Math.PI * (radio * radio);
        double perimetro = (2 * Math.PI) * radio;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
        return new Circulo(radio);


    }
}
