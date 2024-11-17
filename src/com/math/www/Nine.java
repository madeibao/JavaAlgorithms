package com.math.www;

/**
 * @ClassName Nine
 * @Author：Mayuan
 * @Date 2023/9/3/0003 11:21
 * @Description TODO
 * @Version 1.0
 **/
public class Nine {

    private static void nine() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d  ", i, j, i * j);
            }
            System.out.println();
        }
    }

    private static void nineTeen() {
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d  ", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nineTeen();
    }
}
