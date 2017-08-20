package com.venkat.testing.service.impl;

import com.venkat.testing.service.ICalculater;
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
}
