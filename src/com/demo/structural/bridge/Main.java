package com.demo.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle(new RedColor());
        circle.draw();
        System.out.println();
        Shape rectangle=new Rectangle(new BlueColor());
        rectangle.draw();
    }
}
