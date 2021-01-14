package com.designpattern.www.iterator.bridgepattern;

/**
 * @ClassName Square
 * @Author：Mayuan
 * @Date 2020/7/6 16:21
 * @Description TODO
 * @Version 1.0
 **/
public class Square extends Shape {
    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
