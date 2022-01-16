package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /*
     * This main can throw an ArithmeticException!!!
     * @param args
     */

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try { firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Never divide by zero!");
        } finally {System.out.println("Math is hard");
        }

    }
}
