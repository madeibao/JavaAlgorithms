package com.designpattern.www.iterator.bridgepattern;

/**
 * @ClassName Gray
 * @Author：Mayuan
 * @Date 2020/7/6 16:22
 * @Description TODO
 * @Version 1.0
 **/
public class Gray implements Color {

    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
