package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(12, 5);

        int result = calculator.add();

        if (result==17) {
            System.out.println("Test for adding- OK");
        } else {
            System.out.println("Test for adding- Error!!");
        }

        int result1 = calculator.subtract();

        if (result1==7) {
            System.out.println("Test for subtracting- OK");
        } else {
            System.out.println("Test for subtracting- Error!!");
        }

    }

}

