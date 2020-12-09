package com.technosmithlabs.dp.structural.facade;

public class FacadeLayer {

    private ShapeDraw circle;
    private ShapeDraw square;
    private ShapeDraw triangle;

    public FacadeLayer() {
        this.circle = new Circle();
        this.square = new Square();
        this.triangle = new Triangle();
    }

    public void drawMyCircle() {
        this.circle.drawMyShape();
    }

    public void drawMySquare() {
        this.square.drawMyShape();
    }

    public void drawMyTriangle() {
        this.triangle.drawMyShape();
    }
}
