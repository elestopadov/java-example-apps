package com.example.calculator;

/** 
 * This is simple class 'Calculator' with method <b>main</b>.
 * @author Evg
 * @version 0.1
*/

public class Calculator implements ICalculator {
    /**
     * Description of method sum(). 
    */
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
    /**
     * Description of method subtraction(). 
    */
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

    
  /**
  * This method: main
  * @param args are arguments
  */
    public static void main(String[] args) 
    {
        int a = 0;
        String ne_ws;
        System.out.println("Hello Calculator...");
    }
}
