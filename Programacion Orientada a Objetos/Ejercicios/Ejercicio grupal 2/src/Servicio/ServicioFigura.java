package Servicio;

import Entidad.Cuadrado;

import java.util.Scanner;

public class ServicioFigura {

    Scanner leer = new Scanner(System.in);

    public void elegirFigura(){

        System.out.println("Elija un numero para seleccionar la figura");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo equilatero");
        System.out.println("4. Circulo");
        System.out.println("5. Pentagono");
        System.out.println("6. Rombo");
        System.out.println("7. Hexagono");
        int figura = leer.nextInt();

        switch (figura){
            case 1:
                ServicioCuadrado sc = new ServicioCuadrado();
                sc.crearCuadrado();
                break;
            case 2:
                ServicioRectangulo sr = new ServicioRectangulo();
                sr.crearRectangulo();
                break;
            case 3:
                ServicioTriangulo st = new ServicioTriangulo();
                st.crearTriangulo();
                break;
            case 4:
                ServicioCirculo scir = new ServicioCirculo();
                scir.crearCirculo();
                break;
            case 5:

            case 6:

            case 7:
        }

    }



}
