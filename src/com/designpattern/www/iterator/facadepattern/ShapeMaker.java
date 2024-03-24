package com.designpattern.www.iterator.facadepattern;

/**
 * @ClassName ShapeMaker
 * @Author：Mayuan
 * @Date 2020/7/8 10:41
 * @Description TODO
 * @Version 1.0
 **/
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
