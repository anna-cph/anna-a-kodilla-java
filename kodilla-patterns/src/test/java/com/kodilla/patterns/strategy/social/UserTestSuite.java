package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User anna = new Millenials("Anna Banana");
        User john = new ZGeneration("John Doe");
        User tom = new YGeneration("Tom Dome");

        //When
        String annaPosting = anna.sharePost();
        System.out.println("Anna posting " + annaPosting);
        String johnPosting = john.sharePost();
        System.out.println("John posting " + johnPosting);
        String tomPosting = tom.sharePost();
        System.out.println("Tom posting " + tomPosting);

        //Then
        assertEquals("[Twitter] Sharing a post on Twitter.", annaPosting);
        assertEquals("[Facebook] Sharing a post on Facebook.", johnPosting);
        assertEquals("[Snapchat] Sharing a post on Snapchat.", tomPosting);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User anna = new Millenials("Anna Banana");

        //When
        String annaPosting = anna.sharePost();
        System.out.println("Anna posting " + annaPosting);

        //Then
        assertEquals("[Twitter] Sharing a post on Twitter.", annaPosting);
    }
}
