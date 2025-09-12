package com.demo.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showDetails(){
        System.out.println("this is a singleton");
    }
}
