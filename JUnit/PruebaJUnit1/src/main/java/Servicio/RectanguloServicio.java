package Servicio;

import Entidad.Rectangulo;

public class RectanguloServicio {


    public double calcularArea(Rectangulo r){

        return r.getAncho() * r.getLargo();
    }

    public double calcularPerimetro(Rectangulo r){

        return 2 * (r.getAncho() + r.getLargo());
    }
}
