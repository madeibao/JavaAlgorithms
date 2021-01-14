package com.designpattern.www.iterator.bridgepattern;

/**
 * @ClassName Shape
 * @Author：Mayuan
 * @Date 2020/7/6 16:03
 * @Description TODO
 * @Version 1.0
 **/
public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 抽象类里面的方法没有具体的实现。
     */
    public abstract void draw();
}
