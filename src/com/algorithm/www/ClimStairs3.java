package com.algorithm.www;

/**
 * @ClassName ClimStairs3
 * @Author：Mayuan
 * @Date 2020/3/26 16:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * 递归的解法，来解决爬楼梯
 **/
public class ClimStairs3 {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int num1 = 1;
        int num2 = 2;
        int numN = 0;
        for (int i = 2; i < n; i++) {
            numN = num1 + num2;
            num1 = num2;
            num2 = numN;
        }
        return numN;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(12));
    }
}
