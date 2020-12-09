package com.technosmithlabs.dp.structural.bridge;

public class BridgeDemo {
    public static void main(String args[]) {
        Shape square = new Square(new RedColor());
        square.paintColor();
        Shape circle = new Circle(new BlueColor());
        circle.paintColor();
    }
}
