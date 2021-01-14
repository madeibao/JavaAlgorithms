package com.designpattern.www.iterator.factorypattern;

/**
 * @ClassName Circle
 * @Author：Mayuan
 * @Date 2020/7/7 9:07
 * @Description TODO
 * @Version 1.0
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
