package Servicio;

import Entidad.Cuenta;

import java.util.Scanner;

public class ServicioCuenta {

    public Cuenta altaCuenta(){

        Cuenta c1 = new Cuenta();

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el numero de Cuenta");
        c1.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese el numero el dni");
        c1.setDni(leer.nextInt());

        c1.setDni(0);

        return c1;
    }

    public void ingresar(Cuenta nombreCuenta, double saldo){

        double saldoEnCuenta = nombreCuenta.getSaldoActual();

        nombreCuenta.setSaldoActual(saldoEnCuenta + saldo);
    }

    public void retirar(Cuenta nombreCuenta, double saldo){

        double saldoEnCuenta = nombreCuenta.getSaldoActual();

        if (saldoEnCuenta > saldo){
            nombreCuenta.setSaldoActual(saldoEnCuenta - saldo);
        } else {
            nombreCuenta.setSaldoActual(0);
        }
    }

   public void extraccionRapida(Cuenta nombreCuenta, double saldo){
       double saldoEnCuenta = nombreCuenta.getSaldoActual();

       if((saldoEnCuenta * 20)/100 >= saldo){
           nombreCuenta.setSaldoActual(saldoEnCuenta - saldo);
       } else{
           System.out.println("No puede retirar ese monto");
       }
   }

    public void consultarSaldo(Cuenta nombreCuenta){
        System.out.println("su saldo disponible es: " + nombreCuenta.getSaldoActual());
    }

    public void consultarDatos(Cuenta nombreCuenta){
        System.out.println("Numero de cuenta: " + nombreCuenta.getNumeroCuenta());
        System.out.println("Dni del titular: " + nombreCuenta.getDni());
        System.out.println("Saldo disponible: " + nombreCuenta.getSaldoActual());

    }


}
