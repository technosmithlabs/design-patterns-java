package com.technosmithlabs.dp.structural.facade;

public class FacadeDemo {
    public static void main(String args[]) {
        FacadeLayer facade = new FacadeLayer();
        facade.drawMyCircle();
        facade.drawMySquare();
        facade.drawMyTriangle();
    }
}
