package org.lasencinas;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DniTest {

    private Dni dni = null;

    @Before
    public void init() {
        dni = new Dni(43256783,  "S");
    }

    @Test
    public void dniCompletoTest() {
        assertEquals("43256783S", dni.getDni());
    }
}
