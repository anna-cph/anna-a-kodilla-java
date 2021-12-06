package com.kodilla.stream;

import com.kodilla.stream.beautifier.FunctionalBeautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Beautifying the text:");
        poemBeautifier.beautify("Molly meows", FunctionalBeautifier::addABC);
        poemBeautifier.beautify("Molly meows", FunctionalBeautifier::returnCapitalLetters);
        poemBeautifier.beautify("Molly meows", FunctionalBeautifier::addStars);
        poemBeautifier.beautify("MollyTheCat", FunctionalBeautifier::addHashtag);
    }
}
