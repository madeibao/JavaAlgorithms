package com.designpattern.www.iterator.factorypattern;

/**
 * @ClassName Square
 * @Author：Mayuan
 * @Date 2020/7/7 9:06
 * @Description TODO
 * @Version 1.0
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
