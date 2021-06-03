package com.algorithm.www;

/**
 * @ClassName Pow6
 * @Author：Mayuan
 * @Date 2021/6/2/0002 9:52
 * @Description TODO
 * @Version 1.0
 *
 * 幂指数运算/
 *
 * 对于一些极端的情况来进行考虑
 * 比如    n = Integer.MIN_VALUE;
 *
 **/
public class Pow6 {

    public static double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? pow(x, N) : 1.0 / pow(x, -N);
    }
    private static double pow(double x, long n) {
        if(n==0) {
            return 1.0;
        }
        double temp = pow(x, n/2);
        return n%2==0?temp*temp:temp*temp*x;
    }
    public static void main(String[] args) {
        double x  = 2.00000;
        int n = 10;
        System.out.println(myPow(x,n));

    }
}
