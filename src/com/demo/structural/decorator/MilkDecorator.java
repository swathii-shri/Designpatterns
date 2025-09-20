package com.demo.structural.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
    @Override
    public String getDescription() {
        return "";
    }
}
