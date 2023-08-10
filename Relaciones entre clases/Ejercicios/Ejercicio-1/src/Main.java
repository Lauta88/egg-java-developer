import Entidades.Perro;
import Entidades.Persona;

/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Main {

    public static void main(String[] args){


    Persona persona1 = new Persona("Carlos", "Jimenez", 42, 18203625);
    Persona persona2 = new Persona("Juan", "Lopez", 40, 10203655);

    Perro perro1 = new Perro("Chiquito", "Cocker", 9, "mediano-chico");
    Perro perro2 = new Perro("Pancho", "West Highland", 5, "Chico");

    persona1.adoptarPerro(perro1);
    persona2.adoptarPerro(perro2);

    persona1.mostrarDatos();

    System.out.println();
    System.out.println("--------------");
    System.out.println();

    persona2.mostrarDatos();



    }
}