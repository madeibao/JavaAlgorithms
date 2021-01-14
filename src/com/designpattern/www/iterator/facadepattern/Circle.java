package com.designpattern.www.iterator.facadepattern;

/**
 * @ClassName Circle
 * @Author：Mayuan
 * @Date 2020/7/8 10:40
 * @Description TODO
 * @Version 1.0
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
