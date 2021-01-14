package com.designpattern.www.iterator.factorypattern;

/**
 * @ClassName ShapeFactory
 * @Author：Mayuan
 * @Date 2020/7/7 9:08
 * @Description TODO
 * @Version 1.0
 **/
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
