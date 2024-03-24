package com.ACompany.www;

import java.util.Scanner;

/**
 * @ClassName Ease808
 * @Author：Mayuan
 * @Date 2020/8/8 19:25
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数字由多少个移位的运算来实现的。
 * <p>
 * 3
 * 1 1 1
 * 输出：
 * 0
 * <p>
 * 3
 * 5 3 7
 * 输出：
 * 6
 * <p>
 * 其中5 可以由 2+3 两个素数，
 * 3 智能由3 一个素数
 * 7 只能由2+2+3 三个素数来组成。
 **/
public class Ease808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ans += sc.nextInt() >> 1;
        }
        System.out.print(ans);
    }
}
