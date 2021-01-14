package com.designpattern.www.iterator.bridgepattern;

/**
 * @ClassName Client
 * @Author：Mayuan
 * @Date 2020/7/6 16:25
 * @Description TODO
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {

        // 画出一个白色的图形。
        Color white = new White();

        // 正方形.
        Shape square = new Square();
        square.setColor(white);
        square.draw();

        // 画一个长方形。
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();

    }
}
