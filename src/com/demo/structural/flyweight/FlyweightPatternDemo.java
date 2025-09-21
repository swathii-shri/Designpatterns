package com.demo.structural.flyweight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        Shape Circle1 = ShapeFactory.getCircle("red");
        Circle1.draw(10, 20);
        Shape Circle2 = ShapeFactory.getCircle("green");
        Circle2.draw(30, 40);
        Shape BlueCircle = ShapeFactory.getCircle("blue");
        BlueCircle.draw(50, 60);
    }
}
