/*

Crear una clase "Vehículo" con atributos como "marca",
"modelo",
"año" y "tipo" (En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
Referencias:
-Moverse: Es la cantidad de metros que avanzará por segundo.
Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
más metros.
Un automóvil avanza 3 metros por segundo.
Una motocicleta avanza 2 metros por segundo.
Una bicicleta avanza 1 metro por segundo.
Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó
 */

package Servicio;

import Entidad.Vehiculo;

import java.util.Scanner;


public class ServicioVehiculo {
    Scanner leer = new Scanner(System.in);

    public Vehiculo crearVehiculo(){
        System.out.println("Ingrese la marca del vehiculo");
        String marca = leer.next();
        System.out.println("Ingrese el modelo del vehiculo");
        String modelo = leer.next();
        System.out.println("Ingrese el año del vehiculo");
        int anio = leer.nextInt();
        System.out.println("Ingrese el tipo del vehiculo");
        String tipo = leer.next();
        int distanciaRecorrida = 0;

        return new Vehiculo(marca, modelo, anio, tipo, distanciaRecorrida);
    }
    public void moverse(Vehiculo vehiculo){
        System.out.println("Ingrese la cantidad de segundos");
        int segundos = leer.nextInt();
        String tipo = vehiculo.getTipo();

        if(tipo.equalsIgnoreCase("automovil")){
             vehiculo.setDistanciaRecorrida(3 * segundos);
        } else if (tipo.equalsIgnoreCase("motocicleta") ) {
            vehiculo.setDistanciaRecorrida(2 * segundos);
        } else if (tipo.equalsIgnoreCase("bicicleta")){
            vehiculo.setDistanciaRecorrida(segundos);
        }else {
            vehiculo.setDistanciaRecorrida(0);
        }
    }

    public void frenar(Vehiculo vehiculo){
       if(!vehiculo.getTipo().equalsIgnoreCase("bicicleta")){
          vehiculo.setDistanciaRecorrida(vehiculo.getDistanciaRecorrida()+2);
       }
        System.out.println("El vehiculo reccorrio " + vehiculo.getDistanciaRecorrida() + "mts");
    }


}
