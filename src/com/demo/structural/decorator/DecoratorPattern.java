package com.demo.structural.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee coffee=new EspressoCoffee();
        System.out.println(coffee.getDescription()+"$"+coffee.getCost());
        coffee=new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+"$"+coffee.getCost());
        coffee=new SugarDecorator(coffee);
        System.out.println(coffee.getDescription()+"$"+coffee.getCost());
    }
}
