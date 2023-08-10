package Entidad;

import Servicio.RectanguloServicio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectanguloTest {

    public RectanguloTest(){
    }

    RectanguloServicio rs;

    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearUpClass(){
    }
    @Before
    public void setUp(){
        rs = new RectanguloServicio();
    }
    @After
    public void tearDown(){

    }
    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10, 10).getColor());
    }

    @Test
    public void deberiaCalculaArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10, 10)), 0);
        assertEquals(20, rs.calcularArea(new Rectangulo(4, 5)), 0);
        assertEquals(1, rs.calcularArea(new Rectangulo(1,1)), 0);
    }

    @Test
    public void deberiaCalculaPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10, 10)), 0);
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20, 30)), 0);
        assertEquals(30, rs.calcularPerimetro(new Rectangulo(5, 10)), 0);
    }

    @Test
    public void deberiaActivarODesactivar(){
        Rectangulo r = new Rectangulo(5, 5);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }

}