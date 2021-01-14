package com.designpattern.www.iterator.facadepattern;

/**
 * @ClassName FacadePatternDemo
 * @Author：Mayuan
 * @Date 2020/7/8 10:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 这里展示的是Java的外观模式。
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
