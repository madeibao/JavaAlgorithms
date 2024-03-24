package com.designpattern.www.iterator.bridgepattern;

/**
 * @ClassName White
 * @Author：Mayuan
 * @Date 2020/7/6 16:22
 * @Description TODO
 * @Version 1.0
 **/
public class White implements Color {

    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
