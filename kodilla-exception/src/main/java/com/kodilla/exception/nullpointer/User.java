package com.kodilla.exception.nullpointer;

public class User {
    private String name;
    private int age;
    private int numberPosts;
    private String nameOfTask;

    public User(String name, int age, int numberPosts, String nameOfTask) {
        this.name = name;
        this.age = age;
        this.numberPosts = numberPosts;
        this.nameOfTask = nameOfTask;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }
}
