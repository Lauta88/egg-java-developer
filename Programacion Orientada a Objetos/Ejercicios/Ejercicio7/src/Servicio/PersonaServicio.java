/*
Ejercicio7
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package Servicio;

import Entidad.Persona;

import java.util.Scanner;


public class PersonaServicio {



    public Persona crearPersona(){

        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);

        Persona p1 = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.nextLine());

        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());

        System.out.println("Ingrese el sexo de la persona");
        System.out.println("H para hombre");
        System.out.println("M para mujer");
        System.out.println("O para Otro");
        String sexo = leer2.nextLine();

        while(!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")  && !sexo.equalsIgnoreCase("O")){
            System.out.println("Ingreso erroneo intentelo nuevamente");
            System.out.println("H para hombre");
            System.out.println("M para mujer");
            System.out.println("O para Otro");
            sexo = leer.nextLine();
        }
        p1.setSexo(sexo);


        System.out.println("Ingrese el peso de la persona en kilogramos");
        p1.setPeso(leer.nextInt());

        System.out.println("Ingrese la altura de la persona en metros");
        p1.setAltura(leer.nextInt());

        return  p1;

    }

    public int calcularIMC(Persona persona){
        double imc = persona.getPeso() / ((persona.getAltura() / 100 )* persona.getAltura());

        if(imc < 20){
            return -1;
        } else if (imc >= 20 || imc <=25 ) {
            return 0;
        }else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona persona){
        if(persona.getEdad() > 17){
            return true;
        } else {
           return false;
        }
    }
}
