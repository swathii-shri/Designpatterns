package com.demo.structural.decorator;

public class EspressoCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.5;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
