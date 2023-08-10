package Entidad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PalindromeCheckerTest {

    PalindromeChecker pc;

    @Before
    public void setUp() throws Exception {
        pc = new PalindromeChecker();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void deberiaChequearPalindromo(){

        assertEquals(true, pc.esUnPalindromo("neuquen"));
        assertEquals(true, pc.esUnPalindromo("reconocer"));
        assertEquals(true, pc.esUnPalindromo("amor a roma"));
        assertEquals(false, pc.esUnPalindromo("hola"));
        assertEquals(false, pc.esUnPalindromo("perro"));

    }
}