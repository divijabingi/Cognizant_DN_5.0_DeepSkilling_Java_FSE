package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise4Test {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int a = 10;
        int b = 4;
        int result = calculator.subtract(a, b);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int a = 6;
        int b = 7;
        int result = calculator.multiply(a, b);
        assertEquals(42, result);
    }

    @Test
    public void testDivide() {
        int a = 15;
        int b = 3;
        double result = calculator.divide(a, b);
        assertEquals(5.0, result, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int a = 10;
        int b = 0;
        calculator.divide(a, b);
    }

    @Test
    public void testIsEven() {
        int number = 10;
        boolean result = calculator.isEven(number);
        assertTrue(result);
    }
}