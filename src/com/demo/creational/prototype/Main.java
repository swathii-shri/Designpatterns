package com.demo.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "jhon");
        e1.showDetails();

        Employee e2= (Employee) e1.clone();
        System.out.println(e1 == e2);
        System.out.println("Hello");

    }
}
