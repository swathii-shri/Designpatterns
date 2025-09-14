package com.demo.creational.abstractdp;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory=null;

        factory=new ModernFurnitureFactory();
        Chair chair1=factory.createChair();
        chair1.create();
        Sofa sofa1=factory.createSofa();
        sofa1.create();

    }
}
