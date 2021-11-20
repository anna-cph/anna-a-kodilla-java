package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator(12, 5);

        int result1 = calculator.add();

        if (result1==17) {
            System.out.println("Test for adding- OK");
        } else {
            System.out.println("Test for adding- Error!!");
        }

        int result2 = calculator.subtract();

        if (result2==7) {
            System.out.println("Test for subtracting- OK");
        } else {
            System.out.println("Test for subtracting- Error!!");
        }

    }

}

