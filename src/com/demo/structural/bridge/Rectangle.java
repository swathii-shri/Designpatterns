package com.demo.structural.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Rectangle draw with ");
        color.applyColor();
    }

}
