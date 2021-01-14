package com.designpattern.www.iterator.proxypattern;

/**
 * @ClassName ProxyPatternDemo
 * @Author：Mayuan
 * @Date 2020/7/8 16:53
 * @Description TODO
 * @Version 1.0
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 相当于从代理点来进行加载。
        // 图像不需要从磁盘加载
        image.display();
    }
}
