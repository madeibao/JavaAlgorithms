package com.algorithm.www;

/**
 * @ClassName CutLines
 * @Author：Mayuan
 * @Date 2020/6/5 21:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 剪去绳子的算法。
 **/
public class CutLines {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if (b == 0) return (int) Math.pow(3, a);
        if (b == 1) return (int) Math.pow(3, a - 1) * 4;
        return (int) Math.pow(3, a) * 2;
    }

    public static void main(String[] args) {
        System.out.println(new CutLines().cuttingRope(8));

    }
}
