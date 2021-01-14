package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->HuiWenNumer
 * @description: 判断是否为回文数字
 * @author: MaYuan
 * @create: 2020-02-10 21:05
 * @version: 1.0
 **/
public class HuiWenNumber {

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.reverse().toString().equals(String.valueOf(x));
    }

    /**
     * 判断一个数字是否为回文数字。
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome2(int x) {
        //将原来的值保留一份
        int theNum = x;
        //如果输入值等于0，直接返回 true
        if (x == 0) {
            return true;
        }
        //如果输入值是  负数  或者是  整数 ，直接返回false
        if (x < 0 || (x % 10) == 0) {
            return false;
        }
        int temp = 0;
        while (x > 0) {
            //将得到的余数又重新计算出一个新的值
            temp = temp * 10 + (x % 10);
            x /= 10;
        }
        //如果重新计算出新的值和原来的数值值一样，说明是回文数，否则不是
        return theNum == temp ? true : false;
    }

    public static void main(String[] args) {
        int x = 111;
        System.out.println(isPalindrome(x));
    }
}


