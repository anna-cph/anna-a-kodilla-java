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


    public double add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        //return "Adding " + a + " to " + b + ": " + display.displayValue(result);
        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return result;
        //return "Subtracting " + a + " from " + b + ": " + display.displayValue(result);
    }

    public double mul(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
        //return "Multiplying " + a + " and " + b + ": " + display.displayValue(result);
    }

    public double div(double a, double b) {
        double result = a / b;
        display.displayValue(result);
        return result;
        //return "Dividing " + a + " by " + b + ": " + display.displayValue(result);
    }

}
