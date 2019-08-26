package org.lasencinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FechaTest {

    private Fecha fechaVacia = null;
    private Fecha fecha = null;
    private Fecha fechaFail = null;

    @Before
    public void init() {
        fechaVacia = new Fecha();
        fecha = new Fecha(12, 11, 2017);
        fechaFail = new Fecha(54, 43, 2032);
    }

    @Test
    public void newFechaVaciaTest() {
        assertEquals("1-1-1900", fechaVacia.getFecha());
    }

    @Test
    public void newFechaTest() {
        assertEquals("12-11-2017", fecha.getFecha());
    }

    @Test
    public void newFechaFailTest() {
        assertEquals("1-1-1900", fechaFail.getFecha());
    }

    @Test
    public void incrementarFechaTest() {
        fecha.incrementarFecha(4);
        assertEquals(16, fecha.getDia());
    }

    @Test
    public void imprimirFecha() {
        assertEquals("12-Noviembre-2017", fecha.imprimirFecha());
    }
}
