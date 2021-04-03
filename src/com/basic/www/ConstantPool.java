package com.basic.www;

/**
 * @ClassName ConstantPool
 * @Author：Mayuan
 * @Date 2021/4/1/0001 11:06
 * @Description TODO
 * @Version 1.0
 *
 * Java中的常量池技术
 *
 *
 **/
public class ConstantPool {

    public static void main(String[] args) {
        //只拿Integer 举例
        //此处有一步装箱操作 Integer  valueOf
        Integer a = 10;
        Integer b = 10;
        //实现了常量池技术，所以此处相等
        System.out.println(a == b);
        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);

        // new 了新对象  与a 所在的常量池 地址不一样
        Integer e = new Integer(10);
        System.out.println(a == e);

        // 关键在于此处进行了运算，固 f 在此处进行了自动拆箱操作，拆箱后 是int 数值
        Integer f = new Integer(10);
        f = f+0;

        // 自动的拆箱。
        // 由于进行了运算，变成了基本的常量，所以为true
        System.out.println(a == f);

    }
}
