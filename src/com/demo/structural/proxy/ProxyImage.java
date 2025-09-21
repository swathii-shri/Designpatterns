package com.demo.structural.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    private String fileName;
    @Override
    public void dispaly() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        else {
            realImage.dispaly();
        }
    }
}
