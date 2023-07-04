package Servicio;


import Entidad.Pentagono;

import java.util.Scanner;

public class ServicioPentagono {

    Scanner leer = new Scanner(System.in);
    public Pentagono crearPentago(){
        System.out.println("Ingrese el lado");
        int lado = leer.nextInt();

        int area = ((lado * lado) * (Math.sqrt(5)  (5+2√5))) / 4;
        (a² x (√5 x (5+2√5))) / 4
        int perimetro = lado * 5;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
        return new Pentagono(lado);


    }
}
