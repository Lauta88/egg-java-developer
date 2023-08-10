package Servicio;
/*
A% de C = C*A/100)
 */
public class ServicioDiscountCalculator {


    public double calcularDescuento(double precioProducto, int descuento){

        return  precioProducto - (descuento * precioProducto / 100);
    }

}
