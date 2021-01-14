package com.algorithm.www;

/**
 * @program: Pro1->IsPerfectSquare
 * @description: 判断是否能够完全的开平方
 * @author: MaYuan
 * @create: 2019-12-25 20:01
 * @version: 1.0
 * 判断一个数是不是可以完全的开平方。
 **/
public class IsPerfectSquare {
    public static boolean isPerfectSquareNumber(int num) {
        for (int i = 0; i < num / 2; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectSquareNumber2(int num) {
        if (num == 1) {
            return true;
        }
        long left = 2;
        long right = num / 2 + 1;
        while (right >= left) {
            long mid = (left + right) >> 1;
            if (mid * mid == num)
                return true;
            else if (mid * mid < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquareNumber(16));
    }
}



