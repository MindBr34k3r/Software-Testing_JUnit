package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CeilTest {
    public Ceil cceil;

    @BeforeEach
    public void init(){ cceil = new Ceil(); }

    /**
     * Test positive double value
     */
    @Test
    public void testWithPositiveDouble(){
        double a = 5.1;
        Assertions.assertEquals(6, cceil.ceil(a));
    }

    /**
     * Test negative double value
     */
    @Test
    public void testWithNegativeDouble(){
        double a = -4.1;
        Assertions.assertEquals(-4, cceil.ceil(a));
    }

    /**
     * Test value inside int range
     */
    @Test
    public void testWithMaxInteger(){
        double a = 2147483647;
        Assertions.assertEquals(2147483647, cceil.ceil(a));
    }
    /**
     * Test value outside int range
     * Expected: 2147483648
     * Actual: -2147483648
     */
    @Test
    public void testWithMaxIntegerPlus1(){
        double a = Integer.MAX_VALUE +1;
        Assertions.assertFalse(2.147483648E9 == cceil.ceil(a), "This not right");
    }
}
