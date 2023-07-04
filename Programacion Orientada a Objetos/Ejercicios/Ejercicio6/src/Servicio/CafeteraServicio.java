/*
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidad.Cafetera;

public class CafeteraServicio {

    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera se ha llenado con " + cafetera.getCantidadActual() + "ml");
    }

    public void servirTaza(int tamañoTaza, Cafetera cafetera){
        if(cafetera.getCantidadActual() > tamañoTaza){
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañoTaza);
            System.out.println("La taza se lleno con " + tamañoTaza + "ml" );
            System.out.println("La cafetera quedo con  " + cafetera.getCantidadActual() + "ml" );
        } else {
            tamañoTaza = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("La taza no pudo lenarse, que con " + tamañoTaza + "ml");
            System.out.println("La cafetera quedo vacia con " + cafetera.getCantidadActual() + "ml");
        }
    }

    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera se ha vaciado y quedo con " + cafetera.getCantidadActual() + "ml");
    }

    public void agregarCafe(int cantidadCafe, Cafetera cafetera){
        if(cafetera.getCantidadActual() + cantidadCafe < cafetera.getCapacidadMaxima())
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe );
        System.out.println("La cafetera se lleno con " + cantidadCafe + "ml");
        System.out.println("La cafetera quedo con un total de " + cafetera.getCantidadActual() + "ml");
    }



}
