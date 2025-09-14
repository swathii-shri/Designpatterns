package com.demo.structural.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.print("Circle draw with ");
        color.applyColor();

    }
}
