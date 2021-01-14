package com.basicJava8.www;

/**
 * @ClassName Constructor
 * @Author：Mayuan
 * @Date 2020/3/9 22:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * java的构造器的使用
 **/

class Rock {
    /**
     * Java定义一个基本的构造器
     */
    public Rock() {
        System.out.print("rock ");
    }
}

/***
 * @author mayuan
 *
 */
public class Constructor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
