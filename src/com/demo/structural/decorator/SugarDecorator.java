package com.demo.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost()+1.0;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription()+" and Sugar";
    }
}

