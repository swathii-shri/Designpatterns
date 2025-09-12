package com.demo.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        s1.showDetails();
        System.out.println(s1==s2);
    }
}
