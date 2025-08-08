package com.ejemplo.app2;

import org.junit.Test;
import com.ejemplo.app2.Area;
import static org.junit.Assert.assertEquals;


public class MainTest {
    @Test
    public void testAreaCuadrado() {
        Area area = new Area();
        assertEquals(16, area.cuadrado(4));
    }
}
