/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicio;

import Entidad.Matematica;

public class MatematicaServicio {

    public void devolverMayor(Matematica matematica){

        if(matematica.getNum1() > matematica.getNum2()){
            System.out.println("El numero mayor es " + matematica.getNum1());
        } else if (matematica.getNum1() < matematica.getNum2()) {
            System.out.println("El numero mayor es " + matematica.getNum2());
        }else {
            System.out.println("Los numeros son iguales");
        }
    }

    public void calcularPotencia(Matematica matematica){

        if(matematica.getNum1() > matematica.getNum2()){
            System.out.println(matematica.getNum1() + " elevado a " + matematica.getNum2() + " es " + Math.pow(matematica.getNum1(), matematica.getNum2()));
        } else if (matematica.getNum1() < matematica.getNum2()) {
            System.out.println(matematica.getNum2() + " elevado a " + matematica.getNum1() + " es " + Math.pow(matematica.getNum2(), matematica.getNum1()));
        }else {
            System.out.println(matematica.getNum1() + " elevado a " + matematica.getNum2() + " es " + Math.pow(matematica.getNum1(), matematica.getNum2()));
        }
    }

    public void calcularRaiz(Matematica matematica){

        if(matematica.getNum1() > matematica.getNum2()){
            System.out.println("La raiz cuadrada de " + matematica.getNum2() +" es " + Math.sqrt(matematica.getNum2()));
        } else if (matematica.getNum1() <= matematica.getNum2()) {
            System.out.println("La raiz cuadrada de " + matematica.getNum1() +" es " + Math.sqrt(matematica.getNum1()));
        }
    }
}
