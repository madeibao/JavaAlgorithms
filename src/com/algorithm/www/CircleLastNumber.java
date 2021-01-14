package com.algorithm.www;

/**
 * @ClassName CircleLastNumber
 * @Author：Mayuan
 * @Date 2020/5/27 21:44
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个圆圈中的最后的剩下的数字。
 * 类似于约瑟夫环的结果值。
 **/
public class CircleLastNumber {
    public static int lastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        return (lastRemaining(n - 1, m) + m) % n;
    }

    public static void main(String[] args) {
        int n = 5, m = 3;
        System.out.println(lastRemaining(n, m));
    }
}
