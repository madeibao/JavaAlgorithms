package com.algorithm.www;

/**
 * @ClassName MySqrt
 * @Author：Mayuan
 * @Date 2020/3/24 18:01
 * @Description TODO
 * @Version 1.0
 * <p>
 * 实现开平方的算法
 **/
public class MySqrt {
    public static int mySqrt(int x) {
        long left = 0;
        long right = x / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            // 该值为 mid ^ 2，如果 mid 使用 int，在 x=2147395599 时, 则 mid * mid 会先越界，再被转型成 long
            long sqr = mid * mid;
            // 该值为（mid + 1）^ 2，
            long nextSqr = (mid + 1) * (mid + 1);

            if (sqr == x || (sqr < x && nextSqr > x)) {
                return (int) mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else if (sqr > x) {
                right = mid - 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {

        System.out.println(mySqrt(10));
    }
}
