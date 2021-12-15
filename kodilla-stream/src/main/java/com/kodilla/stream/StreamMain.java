package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultForumMap = theForum.getUserList().stream()

            .filter(user -> user.getSex()=='M')
            .filter(user -> user.getDateOfBirth().getYear() <= LocalDate.now().getYear() -20)
            .filter(user -> user.getNumberOfPosts() > 1)
            .collect(Collectors.toMap(ForumUser::getId, user -> user));

            System.out.println("# elements: " + theResultForumMap.size());             // [2]
            theResultForumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);

        /* String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);
         */

    }
}
