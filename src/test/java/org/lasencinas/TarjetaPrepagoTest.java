package org.lasencinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TarjetaPrepagoTest {

    private TarjetaPrepago tarjetaPrepago = null;
    private Dni nif = null;

    @Before
    public void init() {
        nif = new Dni(43256783,  "S");
        tarjetaPrepago = new TarjetaPrepago("634581614", nif, 1000d);
    }

    @Test
    public void ingresarSaldoTest() {
        tarjetaPrepago.ingresarSaldo(100d);
        assertEquals(1100d, tarjetaPrepago.getSaldo(), 0d);
    }

    @Test
    public void enviarMensajeTest() {
        tarjetaPrepago.enviarMensaje(2);
        assertEquals(999.82d, tarjetaPrepago.getSaldo(), 0d);
    }

    @Test
    public void realizarLlamadaSaldoTest() {
        tarjetaPrepago.realizarLlamada(20);
        assertEquals(999.65d, tarjetaPrepago.getSaldo(), 0d);
    }

    @Test
    public void realizarLlamadaConsumoTest() {
        tarjetaPrepago.realizarLlamada(20);
        assertEquals("0:0:20", tarjetaPrepago.getConsumo().imprimirHora());
    }

    @Test
    public void consultarTarjetaTest() {
        String consulta = "Número de teléfono: 634581614" + "\n" +
                          "DNI: 43256783S" + "\n" +
                          "Saldo disponible: 1000.0" + "\n" +
                          "Consumo total: 0:0:0";
        assertEquals(consulta, tarjetaPrepago.consultarTarjeta());
    }
}
