package com.algorithm.www;

/**
 * @ClassName Hanoi
 * @Author：Mayuan
 * @Date 2020/3/19 17:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java来实现汉诺塔
 ***/

public class Hanoi {

    /**
     * A/B/C分别代表三个柱子,n代表A柱子上的盘子数
     */
    public static void f(int n, char A, char B, char C) {

        if (n == 1) {
            System.out.println("move:" + A + "->" + B);
            return;
        }
        f(n - 1, A, C, B);
        f(1, A, B, C);
        f(n - 1, C, B, A);
    }

    public static void main(String[] args) {
        f(4, 'a', 'b', 'c');
    }

}
