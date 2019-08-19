package org.lasencinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {

    private CuentaCorriente cuentaCorriente = null;
    private Dni dni = null;

    @Before
    public void init() {
        dni = new Dni(43256783,  "S");
        cuentaCorriente = new CuentaCorriente(
                "pepita",
                "potete",
                "direccion1",
                "971878927",
                dni,
                1000);
    }

    @Test
    public void retirarDniTest() {
        cuentaCorriente.retirarDinero(100);
        assertEquals(900, cuentaCorriente.getSaldo(), 0d);
    }

    @Test
    public void ingresarDineroTest() {
        cuentaCorriente.ingresarDinero(100);
        assertEquals(1100, cuentaCorriente.getSaldo(), 0d);
    }

    @Test
    public void saldoNegativoTrue() {
        cuentaCorriente.retirarDinero(2000);
        assertTrue(cuentaCorriente.saldoNegativo());
    }

    @Test
    public void saldoNegativoFalse() {
        assertFalse(cuentaCorriente.saldoNegativo());
    }
}
