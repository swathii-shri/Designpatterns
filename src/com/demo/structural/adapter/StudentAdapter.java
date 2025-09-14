package com.demo.structural.adapter;

public class StudentAdapter implements Student{
    private SchoolStudent schoolStudent;

    public StudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
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
        return "StudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}

