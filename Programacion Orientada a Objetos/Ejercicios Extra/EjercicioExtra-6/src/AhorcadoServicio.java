import java.sql.SQLOutput;
import java.util.Scanner;

/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);



    public Ahorcado crearJuego(){

        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Ingrese la palabra secreta");
        String palabraSecreta = leer.nextLine();
        String[] vector = new String[palabraSecreta.length()];
        ahorcado.setLongitudPalabra(palabraSecreta.length());
        for (int i = 0; i < palabraSecreta.length(); i++) {
           vector[i] = palabraSecreta.substring(i, i + 1);
        }
        ahorcado.setPalabraSecreta(vector);

        System.out.println("Ingrese la cantidad de intentos para descubrir la palabra");
        ahorcado.setCantidadDeJugadas(leer.nextInt());

        return ahorcado;

    }

    public void buscarLetra(String letra, Ahorcado ahorcado){

        boolean letraEncontrada = false;
        for (int i = 0; i < ahorcado.getPalabraSecreta().length ; i++) {
            if (letra.equalsIgnoreCase(ahorcado.getPalabraSecreta()[i])){

                letraEncontrada = true;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
            }
        }
        if (letraEncontrada){
            System.out.println("la letra es correcta");

        } else {
            System.out.println("La letra no es correcta");
            ahorcado.setCantidadDeJugadas(ahorcado.getCantidadDeJugadas() - 1);
            System.out.println("te queda " + ahorcado.getCantidadDeJugadas() );
        }

    }

    public void juego(Ahorcado ahorcado){
        leer.nextLine();
        System.out.println("Bienevenido al juego del ahorcado ");

        while(ahorcado.getPalabraSecreta().length != ahorcado.getLetrasEncontradas() || ahorcado.getCantidadDeJugadas() != 0){
            System.out.println("Elija una letra para ver si se encuentra en la palabra");

            String letra = leer.nextLine();
            buscarLetra(letra, ahorcado);
            if(ahorcado.getPalabraSecreta().length == ahorcado.getLetrasEncontradas() ){
                System.out.println("Felicitaciones has ganado la partida");
                break;
            }else if( ahorcado.getCantidadDeJugadas() == 0){
                System.out.println("Lo siento has perdido la partida");
                break;
            }
        }



    }

}
