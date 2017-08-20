package com.venkat.testing.service.impl;

import com.venkat.testing.service.ICalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Created by Srijan on 20-08-2017.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {

    private ICalculator calculater;

    @Before
    public void setup(){
        calculater = new Calculator();
    }

    @Test
    public void test1Add(){
        assertEquals("addition test", 4, calculater.add(3,1));
    }

    @Test
    public void test2Minus(){
        assertEquals("minus test", 3, calculater.minus(7,4));
    }

    @Test
    public void test3Multiplication(){
        assertEquals("multiplication test", 20, calculater.multiplication(4,5));
    }

    @Test
    public void test4Division(){
        assertEquals("Divison test", 4, calculater.division(20, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void test0DivisionWithException(){
        assertEquals("Divison test", 4, calculater.division(20, 0));
    }

    @After
    public void tearDown(){
        calculater = null;
    }
}
