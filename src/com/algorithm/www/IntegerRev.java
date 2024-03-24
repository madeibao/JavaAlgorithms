package com.algorithm.www;

/**
 * @ClassName IntegerRev
 * @Author：Mayuan
 * @Date 2022/5/29/0029 21:45
 * @Description TODO
 * @Version 1.0
 **/
public class IntegerRev {


    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x = -232;
        System.out.println(reverse(x));
    }
}
