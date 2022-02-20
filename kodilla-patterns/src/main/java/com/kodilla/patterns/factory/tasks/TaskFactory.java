package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING :
                return new DrivingTask("Driving a car", "London", "Ford Fiesta");
            case PAINTING :
                return new PaintingTask("Painting an item", "pink", "door");
            case SHOPPING :
                return new ShoppingTask("Shopping an item", "apples", 22.0);
            default:
                return null;
        }
    }
}
