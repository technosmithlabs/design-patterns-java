package com.technosmithlabs.dp.structural.bridge;

public class Square implements Shape {

    private Color myColor;

    public Square(Color color) {
        this.myColor = color;
        createShape();
    }

    @Override
    public void createShape() {
        System.out.println("Creating Square Shape");
    }

    @Override
    public void paintColor() {
        this.myColor.paintColor();
    }
}
