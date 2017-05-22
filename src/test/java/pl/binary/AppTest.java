package pl.binary;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void checkAllFifteenNumbers() {

        assertEquals(0000,App.toDecimal(0));
        assertEquals(0001,App.toDecimal(1));
        assertEquals(0010,App.toDecimal(2));
        assertEquals(0011,App.toDecimal(3));
        assertEquals(0100,App.toDecimal(4));
        assertEquals(0101,App.toDecimal(5));
        assertEquals(0110,App.toDecimal(6));
        assertEquals(0111,App.toDecimal(7));
        assertEquals(1000,App.toDecimal(8));
        assertEquals(1001,App.toDecimal(9));
        assertEquals(1010,App.toDecimal(10));
        assertEquals(1011,App.toDecimal(11));
        assertEquals(1100,App.toDecimal(12));
        assertEquals(1101,App.toDecimal(13));
        assertEquals(1110,App.toDecimal(14));
        assertEquals(1111,App.toDecimal(15));
    }

    @Test
    public void ifInputIntIsNotNumberFrom0to15() {

    }
}
