package com.venkat.testing.service.impl;

import com.venkat.testing.service.ICalculater;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Srijan on 20-08-2017.
 */
public class CalculaterTest {

    private ICalculater calculater;

    @Before
    public void setup(){
        calculater = new Calculater();
    }

    @Test
    public void testAdd(){
        assertEquals("addition test", 4, calculater.add(3,1));
    }

    @Test
    public void testMinus(){
        assertEquals("minus test", 3, calculater.minus(7,4));
    }

    @Test
    public void testMultiplication(){
        assertEquals("multiplication test", 20, calculater.multiplication(4,5));
    }

    @Test
    public void testDivision(){
        assertEquals("Divison test", 4, calculater.divison(20, 5));
    }

    @After
    public void tearDown(){
        calculater = null;
    }
}
