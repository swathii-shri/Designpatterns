package com.demo.structural.proxy;

public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    private void loadFromDisk(){
        System.out.println("Loadfromdisk" + fileName);
    }
    @Override
    public void dispaly(){
        System.out.println("Displaying"+fileName);
    }
}

