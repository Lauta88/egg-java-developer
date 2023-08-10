package Entidad;

public class DiscountCalculator {

    private double precioProducto;
    private int descuento;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double precioProducto, int descuento) {
        this.precioProducto = precioProducto;
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
