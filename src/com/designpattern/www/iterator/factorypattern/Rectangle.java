package com.designpattern.www.iterator.factorypattern;

/**
 * @ClassName Rectangle
 * @Author：Mayuan
 * @Date 2020/7/7 9:05
 * @Description TODO
 * @Version 1.0
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
