/*
Ejercicio 12
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().

 */
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int ingresosValidos = 0;
        int ingresosInvalidos = 0;
        String secuencia;
        do {
            System.out.println("Ingrese una secuencia");
            secuencia =   leer.nextLine();
            if (secuencia.length() == 5 && secuencia.substring(0,1).equalsIgnoreCase("x") && secuencia.substring(4,5).equalsIgnoreCase("o")) {
                ingresosValidos += 1;
            } else if(!secuencia.equalsIgnoreCase("&&&&&")){
                ingresosInvalidos += 1;
            }
        } while(!secuencia.equalsIgnoreCase("&&&&&") );
        System.out.println("Secuencias validas: " + ingresosValidos);
        System.out.println("Secuencias invalidas: " + ingresosInvalidos);
    }
}