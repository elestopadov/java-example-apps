package com.example.calculator;

/** 
 * Class Description of ICalculator.
 * @author Evg
 * @version 0.1
*/

public interface ICalculator {
    /**
     * Description of method sum(). 
    */
    int sum(int a, int b);
    /**
     * Description of method subtraction(). 
    */
    int subtraction(int a, int b);
    /**
     * Description of method multiplication(). 
    */
    int multiplication(int a, int b);
    /**
     * Description of method divison(). 
    */
    int divison(int a, int b) throws Exception;
    /**
     * Description of method equalIntegers(). 
    */
    boolean equalIntegers(int a, int b);
}
