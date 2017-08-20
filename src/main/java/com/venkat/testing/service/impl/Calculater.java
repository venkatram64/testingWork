package com.venkat.testing.service.impl;

import com.venkat.testing.service.ICalculater;

/**
 * Created by Srijan on 19-07-2016.
 */

public class Calculater implements ICalculater{

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
    public int divison(int a, int b) {
        return a/b;
    }
}
