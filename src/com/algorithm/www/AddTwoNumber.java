package com.algorithm.www;

/**
 * @ClassName AddTwoNumber
 * @Author：Mayuan
 * @Date 2021/3/28/0028 10:44
 * @Description TODO
 * @Version 1.0
 *
 * 两个数字相加。
 **/
public class AddTwoNumber {

    static int add(int a, int b) {
        while (b!=0) {
            int temp = a^b;
            int temp2 = (a&b)<<1;
            a = temp;
            b =temp2;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(3,4));
    }
}
