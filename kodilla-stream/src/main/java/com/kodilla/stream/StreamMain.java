package com.kodilla.stream;

import com.kodilla.stream.beautifier.FunctionalBeautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Beautifying the text:");
        poemBeautifier.beautify("Molly meows", FunctionalBeautifier::addABC);
        poemBeautifier.beautify("Molly meows", FunctionalBeautifier::returnCapitalLetters);
        poemBeautifier.beautify("Molly meows", FunctionalBeautifier::addStars);
        poemBeautifier.beautify("MollyTheCat", FunctionalBeautifier::addHashtag);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
