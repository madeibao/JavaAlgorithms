package com.designpattern.www.iterator.bridgepattern;

/**
 * @ClassName Black
 * @Author：Mayuan
 * @Date 2020/7/6 16:23
 * @Description TODO
 * @Version 1.0
 **/
public class Black implements Color {

    public void bepaint(String shape) {
        System.out.println("黑色的图形" + shape);
    }
}
