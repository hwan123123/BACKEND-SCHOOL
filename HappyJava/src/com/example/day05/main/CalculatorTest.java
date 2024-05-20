package com.example.day05.main;

import com.example.day05.util.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result_plus = calculator.plus(3,5);
        int result_minus = calculator.minus(9,2);

        System.out.println(result_plus);
        System.out.println(result_minus);
    }
}
