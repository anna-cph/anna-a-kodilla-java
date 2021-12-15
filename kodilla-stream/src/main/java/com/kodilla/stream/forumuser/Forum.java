package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(23245, "Iron Man", 'M', 1990, 12, 12, 12));
        theForumUser.add(new ForumUser(12345, "Spider Man", 'M', 2005, 10, 12, 33));
        theForumUser.add(new ForumUser(93851, "Wonder Woman", 'F', 1850, 9, 10, 139));
        theForumUser.add(new ForumUser(56782, "Black Widow", 'F', 1980, 7, 23, 1));
        theForumUser.add(new ForumUser(21345, "Doctor Strange", 'M', 1968, 3, 1, 235));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUser);
    }


}
