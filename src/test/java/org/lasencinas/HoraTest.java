package org.lasencinas;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HoraTest {

    private Hora hora = null;
    private Hora horaFail = null;

    @Before
    public void init() {
        hora = new Hora(12, 45, 34);
        horaFail = new Hora(43, 12, 78);
    }

    @Test
    public void getHoraTest() {
        List<Integer> horas = new ArrayList<>();
        horas.add(12);
        horas.add(45);
        horas.add(34);
        assertEquals(horas, hora.getHora());
    }

    @Test
    public void getHoraFailTest() {
        List<Integer> horas = new ArrayList<>();
        horas.add(0);
        horas.add(0);
        horas.add(0);
        assertEquals(horas, horaFail.getHora());
    }

    @Test
    public void imprimirHoraTest() {
        String horaTest = "12:45:34";
        assertEquals(horaTest, hora.imprimirHora());
    }

    @Test
    public void imprimirHoraFailTest() {
        String horaTest = "0:0:0";
        assertEquals(horaTest, horaFail.imprimirHora());
    }
}
