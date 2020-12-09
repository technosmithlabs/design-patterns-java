package com.technosmithlabs.dp.structural.bridge;

public class Circle implements Shape {

    private Color myColor;

    public Circle(Color color) {
        this.myColor = color;
        createShape();
    }

    @Override
    public void createShape() {
        System.out.println("Creating Circle Shape");
    }

    @Override
    public void paintColor() {
        this.myColor.paintColor();
    }
}
