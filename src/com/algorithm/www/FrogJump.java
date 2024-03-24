package com.algorithm.www;

import java.util.Scanner;

/**
 * @program: Pro1->FrogJump
 * @description: 青蛙跳台阶
 * @author: MaYuan
 * @create: 2019-12-24 19:28
 * @version: 1.0
 * //这是青蛙跳台阶的问题,可以跳一个或者两个台阶.问一共有多少种跳的方式。
 **/
public class FrogJump {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tang = new int[20];
        tang[1] = 1;
        tang[2] = 2;
        for (int i = 3; i < 20; i++) {
            tang[i] = tang[i - 1] + tang[i - 2];
        }
        int n = sc.nextInt();
        System.out.println(tang[n]);
        sc.close();
    }
}
