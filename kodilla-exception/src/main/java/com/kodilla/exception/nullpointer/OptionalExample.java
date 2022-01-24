package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
        //User user = null;

        Optional<User> optionalUser = Optional.ofNullable(user);

        //String username =
                //optionalUser.orElse(new User("Empty user- null", 0, 0, "")).getName();

        optionalUser.ifPresent(u -> System.out.println(u.getName()));

        //System.out.println(username);
    }
}
