package Entidad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidatorTest {


    PasswordValidator pv;

    @Before
    public void setUp() throws Exception {

        pv = new PasswordValidator();

    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void deberiaValidarPassword(){

        assertEquals(true, pv.PasswordIsValid("Hola!1"));
        assertEquals(false, pv.PasswordIsValid("Hola!"));
        assertEquals(false, pv.PasswordIsValid("hola!1"));
    }
}