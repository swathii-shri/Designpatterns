package com.demo.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo1.jpg");
        image.dispaly();
        image.dispaly();
    }
}
