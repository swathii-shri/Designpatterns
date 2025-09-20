package com.demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manger implements Employee {
    private String name;
    private List <Employee> employees = new ArrayList<>();
    public Manger(String name) {
        this.name = name;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }
}
