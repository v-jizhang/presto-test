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
}

