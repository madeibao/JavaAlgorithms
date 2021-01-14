package com.algorithm.www;

/**
 * @ClassName HappyNumber
 * @Author：Mayuan
 * @Date 2020/3/4 20:56
 * @Description TODO
 * <p>
 * 判断是否为快乐数字
 * @Version 1.0
 **/
public class HappyNumber {
    public static boolean isHappy(int n) {
        int x = n;
        for (int i = 0; i < 100; i++) {
            x = chaifen(x);
            if (x == 1) {
                return true;
            }
        }
        return false;
    }

    public static int chaifen(int x) {
        int sum = 0;
        while (x != 0) {
            sum += (x % 10) * (x % 10);
            x /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));

    }
}
