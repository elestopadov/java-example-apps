package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for calculator app.
 */
public class CalculatorTest {
    private static ICalculator calculator;

    @BeforeClass
    public static void initCalculator() {
        calculator = new Calculator();
    }

    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }

    @Test
    public void testSum() {
        int result = calculator.sum(3, 2);
        assertEquals(5, result);
    }
    
    @Test
    public void testMultiplication(){
        int result = calculator.multiplication(4, 4);
        assertEquals(16, result);
    }

    @Test
    public void testSumHundreds() {
        int result = calculator.sum(300, 400);
        assertEquals(700, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtraction(100500, 500);
        assertEquals(100000, result);
    }
    
    @Test
    public void testDivison() {
        try {
            int result = calculator.divison(10, 2);
            assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Test(expected = Exception.class)
    public void testDivisionException() throws Exception {
        calculator.divison(10, 0);
    }

    @Ignore
    @Test
    public void testEqual() {
        boolean result = calculator.equalIntegers(20, 20);
        assertFalse(result);
    }


}
