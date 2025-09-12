package com.demo.creational.builder;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee.EmployeeBuilder()
                .setId(124)
                .setName("Alex")
                .setSalary(40000.0)
                .build();
        System.out.println(emp);
    }
}
