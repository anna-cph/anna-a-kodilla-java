package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }


    public void add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        System.out.println("Adding " + a + " to " + b + ": " + display.displayValue(result));
    }

    public void sub(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        System.out.println("Subtracting " + a + " from " + b + ": " + display.displayValue(result));
    }

    public void mul(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        System.out.println("Multiplying " + a + " and " + b + ": " + display.displayValue(result));
    }

    public void div(double a, double b) {
        double result = a / b;
        display.displayValue(result);
        System.out.println("Dividing " + a + " by " + b + ": " + display.displayValue(result));
    }

}
