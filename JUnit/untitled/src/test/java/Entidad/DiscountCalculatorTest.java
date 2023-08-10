package Entidad;

import Servicio.ServicioDiscountCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    ServicioDiscountCalculator sd;
    @Before
    public void setUp() throws Exception {
        sd = new ServicioDiscountCalculator();

    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void deberiaCalcularDescuento(){

        assertEquals(90, sd.calcularDescuento(100, 10), 0);
        assertEquals(100, sd.calcularDescuento(100, 0), 0);
        assertEquals(50, sd.calcularDescuento(100, 50), 0);
        assertEquals(0, sd.calcularDescuento(100, 100), 0);
    }




}