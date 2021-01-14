package com.designpattern.www.iterator.proxypattern;

/**
 * @ClassName ProxyImage
 * @Author：Mayuan
 * @Date 2020/7/8 16:52
 * @Description TODO
 * @Version 1.0
 **/
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
