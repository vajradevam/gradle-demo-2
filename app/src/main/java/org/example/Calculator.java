package org.example;

import com.google.common.base.Preconditions;

/**
 * Simple skeleton calculator used to verify build, tests, and copying
 * the project to another machine.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int dividend, int divisor) {
        Preconditions.checkArgument(divisor != 0, "divisor must not be zero");
        return (double) dividend / divisor;
    }
}
