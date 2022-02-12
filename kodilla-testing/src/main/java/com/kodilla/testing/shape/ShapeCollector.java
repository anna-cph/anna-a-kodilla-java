package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();


    //1
    public void addFigure(Shape shape) {
        //Shape square = new Square();
        figures.add(shape);
    }

    public int getFigureQuantity() {
        return figures.size();
    }

    //2
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
        figures.remove(shape);
        result = true;
        }
        return result;
    }


    //3
    public Shape getFigure(int figureNumber) {
        Shape shape = null;
        if (figureNumber >= 0 && figureNumber < figures.size()) {
            shape = figures.get(figureNumber);
        }
        return shape;
    }

    //4
    public void showFigures() {
        //method here
    }
}
