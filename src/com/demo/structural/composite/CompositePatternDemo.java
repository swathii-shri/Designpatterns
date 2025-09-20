package com.demo.structural.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Jhon");
        Employee dev2 = new Developer("Jack");
        Manger manger = new Manger("Wilson");
        manger.addEmployee(dev1);
        manger.addEmployee(dev2);
        manger.showDetails();
    }
}
