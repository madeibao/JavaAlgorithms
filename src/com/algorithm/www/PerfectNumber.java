package com.algorithm.www;

/**
 * @ClassName PerfectNumber
 * @Author：Mayuan
 * @Date 2020/2/26 17:20
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为完美数字
 * 所有的公因子的和等于数字本身。
 **/
public class PerfectNumber {

    private static boolean isPerfect(int n) {

        if ((n % 2) != 0) {
            return false;
        }

        int sum = 1;
        int i = 2;
        int s = (int) Math.ceil(Math.sqrt(n));
        for (; i < s; ++i) {
            if (n % i == 0) {
                sum += i + n / i;
            }
        }

        if (i * i == n) {
            sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }
}




