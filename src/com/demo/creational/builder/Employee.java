package com.demo.creational.builder;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.salary = builder.salary;

    }
    public static class EmployeeBuilder{
        private int id;
        private String name;
        private double salary;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}