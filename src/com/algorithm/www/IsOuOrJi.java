package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->IsOuOrJi
 * @description: 判断是否为奇数或者是偶数
 * @author: MaYuan
 * @create: 2019-12-25 20:53
 * @version: 1.0
 **/
public class IsOuOrJi {

    public static void main(String[] args) {
        int x = 3;
        if ((x & 1) == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
