package com.demo.creational.prototype;

public class Employee implements Prototype {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public Prototype clone() {
        return new Employee(id, name);
    }
    public void showDetails() {
        System.out.println(this.id+" "+this.name);

    }

}
