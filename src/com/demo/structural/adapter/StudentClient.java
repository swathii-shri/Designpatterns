package com.demo.structural.adapter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList(){
        List<Student> list=new ArrayList<>();
        CollegeStudent college=new CollegeStudent("jhon", "xyz",
                "jhon@gmail.com");
        SchoolStudent school=new SchoolStudent("smith", "abc",
                "smith@gmail.com");
        StudentAdapter adapter=new StudentAdapter(school);
        list.add(college);
        list.add(adapter);
        return list;
    }
}