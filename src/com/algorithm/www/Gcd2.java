package com.algorithm.www;

/**
 * @ClassName Gcd2
 * @Author：Mayuan
 * @Date 2020/7/11 22:34
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求两个数字的最小公倍数。
 **/
public class Gcd2 {

    public static int getGcd(int m, int n) {
        while (n > 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    /**
     * 求解数m和n和最小公倍数
     */
    public static int getLcm(int m, int n) {
        int gcd = getGcd(m, n);
        int result = m * n / gcd;
        return result;
    }

    public static int getGcd2(int a, int b) {
        return a % b == 0 ? b : getGcd2(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("60和12的最大公约数：" + getGcd(60, 12));
        System.out.println("60和12的最小公倍数：" + getLcm(60, 12));
    }
}
