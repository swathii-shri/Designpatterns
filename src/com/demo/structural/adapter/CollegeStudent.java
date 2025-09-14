package com.demo.structural.adapter;

public class CollegeStudent implements Student {
    private String name;
    private String surname;
    private String email;

    public CollegeStudent(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }


    @Override
    public void getName() {

    }

    @Override
    public void getSurName() {

    }

    @Override
    public void getEmail() {

    }
    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' + ", surname='" + surname + '\'' + ", email='" + email + '\'' + ", name='" + name + '\'' + ", surname='" + surname + '\'' +
                ", email='" + email + '\'' + '}';
    }

}
