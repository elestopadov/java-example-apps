package com.example.calculator;

public class Calculator implements ICalculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int divison(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Divider can't be ZERO");
        }
        return a / b;
    }

    @Override
    public boolean equalIntegers(int a, int b) {
        boolean result = false;
        if (a == b) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        int a = 0;
        String ne_ws;
        System.out.println("Hello Calculator...");
    }
}
