package com.basicJava8.www;

/**
 * @ClassName FunctionAssign
 * @Author：Mayuan
 * @Date 2020/3/12 15:55
 * @Description TODO
 * @Version 1.0
 * <p>
 * 类内部的方法的调用
 **/

class Letter {
    char c;
}

/**
 * @author mayuan
 */
public class FunctionAssign {

    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("x1.c=  " + x.c);
        f(x);
        System.out.println("x1.c=  " + x.c);
    }
}


