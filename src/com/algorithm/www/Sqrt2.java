package com.algorithm.www;

/**
 * @ClassName Sqrt2
 * @Author：Mayuan
 * @Date 2020/12/6/0006 20:57
 * @Description TODO
 * @Version 1.0
 **/
public class Sqrt2 {

    public static int mySqrt(int x) {
        int left = 0, right = x / 2 + 1;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = (int) (mid + 1);
            } else {



                right = (int) (mid - 1);
            }
        }
        return right;
    }

    public static void main(String[] args) {

        int num = 18;
        System.out.println(mySqrt(num));
    }
}
