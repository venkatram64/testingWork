package com.venkat.testing.service.impl;

import com.venkat.testing.service.ICalculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Venkatram on 8/20/2017.
 */

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorParameterizedTest {

    private static ICalculator calculator;
    private int input1;
    private int input2;
    private int output;

    public CalculatorParameterizedTest(int input1, int input2, int output) {
        this.input1 = input1;
        this.input2 = input2;
        this.output = output;
    }

    @Before
    public  void setup(){
        calculator = new Calculator();
    }

    /*@Parameterized.Parameters(name = "{index}: testAdd({0} + {1}) = {2}")
    public static Collection<Object[]> testAddConditions(){
        Object[][] expectedOutputs = {
                {4, 2, 6},
                {60,20, 80}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void test1Add(){
        assertEquals("Calculator add test", output, calculator.add(input1,input2));
    }*/

    @Parameterized.Parameters(name = "{index}: testDivision({0} / {1}) = {2}")
    public static Collection<Object[]> testDivisionConditions(){
        Object[][] expectedOutputs = {
                {4, 2, 2},
                {60,20, 3}
        };
        return Arrays.asList(expectedOutputs);
    }



    @Test
    public void test2Division(){
        assertEquals("Calculator division test", output, calculator.division(input1,input2));
    }


    @After
    public void tearDown(){
        calculator = null;
    }
}
