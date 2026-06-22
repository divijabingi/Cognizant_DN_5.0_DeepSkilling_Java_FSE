package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise3Test {

    @Test
    public void testAssertEquals() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5));
    }
   @Test
  public void testAssertNotEquals() {
        Calculator calc = new Calculator();
        assertNotEquals(99, calc.add(5, 5));
    }

    @Test
    public void testAssertTrue() {
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(8));
    }

    @Test
    public void testAssertFalse() {
        Calculator calc = new Calculator();
        assertFalse(calc.isEven(7));
    }

    @Test
    public void testAssertNull() {
        String str = null;
        assertNull(str);
    }

    @Test
    public void testAssertNotNull() {
        Calculator calc = new Calculator();
        assertNotNull(calc);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAssertEqualsDouble() {
        Calculator calc = new Calculator();
        assertEquals(3.333, calc.divide(10, 3), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testExpectedException() {
        Calculator calc = new Calculator();
        calc.divide(10, 0);
    }
}