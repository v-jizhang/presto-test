package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        assertTrue(app.sayHi());
    }

    @Test
    public void testAddition()
    {
        Calc calc = new Calc();
	    assertTrue(calc.add(1, 1) == 2);
	    assertTrue(calc.add(1, 1) == 4);
    }

    @Test
    public void testSubstract()
    {
        Calc calc = new Calc();
        assertTrue(calc.substract(10, 5) == 5);
    }

    @Test void testMultiply()
    {
        Calc calc = new Calc();
        assertTrue(calc.multiply(2, 5) == 10);
    }

    @Test
    public void testDivide()
    {
        Calc calc = new Calc();
        assertTrue(calc.divide(11, 3) == 3);
    }
}

