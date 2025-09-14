package com.demo.structural.adapter;

public class SchoolStudent {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public SchoolStudent(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
