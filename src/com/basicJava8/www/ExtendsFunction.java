package com.basicJava8.www;

/**
 * @ClassName ExtendsFunction
 * @Author：Mayuan
 * @Date 2020/11/9 21:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * // 继承的是偶首先初始化父类，
 * 然后初始化子类。
 **/

class Super {
    public Super() {
        System.out.println("Super ");
    }
}

public class ExtendsFunction extends Super {
    public ExtendsFunction() {
        System.out.println("extends");
    }

    public static void main(String[] args) {
        ExtendsFunction s = new ExtendsFunction();
    }
}
