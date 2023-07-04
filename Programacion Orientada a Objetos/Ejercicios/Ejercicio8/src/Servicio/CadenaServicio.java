/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidad.Cadena;

public class CadenaServicio {

    public void mostarVocales(Cadena cadena){

        int numeroVocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {

            if(cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("a") || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("e") || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("i") || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("o") || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("u")){

                numeroVocales += 1;
            }
        }
        System.out.println("la contidad de vocales en la frase es: " + numeroVocales);
    }

    public void invertirFrase(Cadena cadena){

        String frase = cadena.getFrase();
        System.out.println("La frase invertida es:");
        for (int i = frase.length()-1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cadena, String letra){

        int letraRepetida = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {

            if(cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)){

                letraRepetida += 1;
            }
        }
        System.out.println("la letra " + letra + " se repite: " + letraRepetida);
    }

    public void compararLongitud(Cadena cadena ,String fraseUsuario){

        String frase = cadena.getFrase();

        if(frase.length() > fraseUsuario.length()){
            System.out.println("La frase nueva tiene " + (frase.length() - fraseUsuario.length()) + " menos caracteres");
        } else  {
            System.out.println("La frase nueva tiene " + (fraseUsuario.length() - frase.length()) + " mas caracteres");
        }
    }

    public void unirFrases(Cadena cadena, String frase){

        System.out.println("la frase nueva es: ");
        System.out.println(cadena.getFrase() + frase);
    }

    public void reemplazar(Cadena cadena,  String letra){

        String frase = cadena.getFrase();

        for (int i = 0; i < frase.length(); i++) {
            if (!frase.substring(i, i+1).equalsIgnoreCase("a")){
                System.out.print(frase.charAt(i));
            }else {
                System.out.print(letra);
            }

        }
        System.out.println("");

    }

    public void contiene(Cadena cadena, String letra){

        String frase = cadena.getFrase();
        boolean contiene = false;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase(letra)){

                contiene = true;
            }
        }

        System.out.println("La frase contiene la letra: " + letra + " = " + contiene);
    }
}
