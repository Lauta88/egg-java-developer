import Entidad.Persona;
import Servicio.PersonaServicio;

/*
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
public class Main {
    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();

        Persona persona1 = ps.crearPersona();
        persona1.setImc(ps.calcularIMC(persona1));
        persona1.setEsMayorDeEdad(ps.esMayorDeEdad(persona1));

        Persona persona2 = ps.crearPersona();
        persona2.setImc(ps.calcularIMC(persona2));
        persona2.setEsMayorDeEdad(ps.esMayorDeEdad(persona2));

        Persona persona3 = ps.crearPersona();
        persona3.setImc(ps.calcularIMC(persona3));
        persona3.setEsMayorDeEdad(ps.esMayorDeEdad(persona3));

        Persona persona4 = ps.crearPersona();
        persona4.setImc(ps.calcularIMC(persona4));
        persona4.setEsMayorDeEdad(ps.esMayorDeEdad(persona4));



        Persona[] arrayPersonas = {persona1, persona2, persona3, persona4};


        int personaBajoPeso = 0;
        int personaPesoCorrecto = 0;
        int personaConSobrePeso = 0;

        int esMayorDeEdad = 0;
        int esMenorDeEdad = 0;

        for (int i = 0; i < arrayPersonas.length ; i++) {
            if (arrayPersonas[i].getImc() == -1){
                personaBajoPeso =+ 1;
            } else if (arrayPersonas[i].getImc() == 0) {
                personaPesoCorrecto =+ 1;
            } else {
                personaConSobrePeso =+ 1;
            }

            if (arrayPersonas[i].isEsMayorDeEdad()){
                esMayorDeEdad =+ 1;
            } else {
                esMenorDeEdad =+ 1;
            }
        }

        System.out.println("Porcentaje Personas con bajo peso: " + (personaBajoPeso * 100) / 4);
        System.out.println("Porcentaje Personas con bajo correcto: " + (personaPesoCorrecto * 100) / 4 );
        System.out.println("Porcentaje Personas con sobre peso: " + (personaConSobrePeso * 100) / 4 );

        System.out.println("Porcentaje Personas Mayores de edad: " + (esMayorDeEdad * 100) / 4 );
        System.out.println("Porcentaje Personas Menores de edad: " + (esMenorDeEdad * 100) / 4);
    }
}