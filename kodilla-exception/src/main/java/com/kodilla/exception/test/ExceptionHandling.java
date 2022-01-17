package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {String result = secondChallenge.probablyIWillThrowException(2.0, 1.0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Something bad happened.");
        } finally {
            System.out.println("You will never learn");
        }
    }
}
