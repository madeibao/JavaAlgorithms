package com.designpattern.www.iterator.proxypattern;

/**
 * @ClassName RealImage
 * @Author：Mayuan
 * @Date 2020/7/8 16:50
 * @Description TODO
 * @Version 1.0
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String filename) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
