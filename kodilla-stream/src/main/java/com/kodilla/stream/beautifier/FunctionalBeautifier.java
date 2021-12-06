package com.kodilla.stream.beautifier;

public class FunctionalBeautifier {
    public static String addABC(String text) {
        return "ABC " + text + " ABC";
    }

    public static String returnCapitalLetters(String text) {
        return text.toUpperCase();
    }

    public static String addStars(String text) {
        return "*** " + text + " ***";
    }

    public static String addHashtag(String text) {
        return "#" + text;
    }

}
