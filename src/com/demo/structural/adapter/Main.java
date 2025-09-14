package com.demo.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> list = client.getStudentList();
        System.out.println(list);
    }
}
