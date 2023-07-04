/*
ejercicio12
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicio;

import Entidad.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){

        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de naciomiento");
        System.out.println("Ingrese el dia utilizando dos numeros");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes utilizando dos numeros");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio utilizando cuatro numeros");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        persona.setFechaNacimiento(fecha);

        return persona;

    }

    public void calcularEdad(Persona persona){
        Date fechaActual = new Date();

       Date anio = persona.getFechaNacimiento();

       int anioActual = fechaActual.getYear();
       int anioNacimiento = anio.getYear();
        System.out.println("La persona tiene " + (anioActual - anioNacimiento));

    }

    public void menorQue(Persona persona, Date fecha){
        boolean menorQue = false;
        if(persona.getFechaNacimiento().compareTo(fecha) < 0){
            menorQue = true;
            System.out.println("Es menor que: " + menorQue);
        }
    }
}
