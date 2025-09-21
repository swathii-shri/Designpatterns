package com.demo.structural.flyweight;

import com.demo.structural.bridge.Color;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> circleMap=new HashMap<>();
    public static Shape getCircle(String color) {
        Circle circle=(Circle)circleMap.get(color);
        if(circle==null) {
            circle=new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}

