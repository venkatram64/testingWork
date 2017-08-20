package com.venkat.testing.service.impl;

import com.venkat.testing.service.ICalculator;

/**
 * Created by Srijan on 19-07-2016.
 */

public class Calculator implements ICalculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if(b == 0) throw new ArithmeticException("Divison with zero");
        return a/b;
    }
}
