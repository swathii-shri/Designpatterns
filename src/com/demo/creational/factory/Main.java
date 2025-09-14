package com.demo.creational.factory;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Tringle();
        Shape square = new Square();
        circle.draw();
        rectangle.draw();
        triangle.draw();
        square.draw();
    }

}
