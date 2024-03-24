package com.algorithm.www;

/**
 * @ClassName PowOfFour
 * @Author：Mayuan
 * @Date 2020/3/21 15:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为4的幂指数
 **/
public class PowOfFour {

    private static boolean isPowFour(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 4 == 0) {
            num /= 4;
        }
        return num == 1;
    }

    private static boolean isPowFour2(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && (num % 3 == 1);
    }

    private static boolean isPowerFour3(int num) {
        if (num < 0 || ((num & num - 1) != 0)) {
            return false;
        } else {
            return (num - 1) % 3 == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowFour(8));
    }
}
