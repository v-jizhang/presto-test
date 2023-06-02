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
	    assertTrue(calc.add(1, 3) == 4);
    }

    @Test
    public void testSubstract()
    {
        Calc calc = new Calc();
        assertTrue(calc.substract(10, 5) == 5);
        assertTrue(calc.substract(5, 12345) == -12340);
    }

    @Test
    public void testMultiply()
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

    @Test
    public void testAbs()
    {
        Calc calc = new Calc();
        assertTrue(calc.abs(-5) == 5);
        assertTrue(calc.abs(5) == 5);
    }

    @Test
    public void testMod()
    {
        // Comment
        Calc calc = new Calc();
        assertTrue(calc.mod(10, 3) == 1);
        assertTrue(!(calc.mod(10, 3) == 2));
    }
}

