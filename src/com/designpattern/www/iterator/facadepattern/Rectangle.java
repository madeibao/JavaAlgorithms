package com.designpattern.www.iterator.facadepattern;

/**
 * @ClassName Rectangle
 * @Author：Mayuan
 * @Date 2020/7/8 10:39
 * @Description TODO
 * @Version 1.0
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
