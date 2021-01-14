package com.AAAA.www;

/**
 * @program: Pro1->Test
 * @description: 基本测试文件
 * @author: MaYuan
 * @create: 2019-12-24 19:18
 * @version: 1.0
 **/

public class Test {

    private static int add(int a,int b) {
        int temp, temp2;
        while (b!=0) {
            temp =a^b;
            temp2= (a&b)<<1;
            a = temp;
            b = temp2;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(3,4));
    }
}

