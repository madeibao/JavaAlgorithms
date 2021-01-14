package com.designpattern.www.iterator.bridgepattern;

/**
 * @ClassName Rectangle
 * @Author：Mayuan
 * @Date 2020/7/6 16:19
 * @Description TODO
 * @Version 1.0
 **/
public class Rectangle extends Shape {

    @Override
    public void draw() {
        color.bepaint("长方形");
    }
}
