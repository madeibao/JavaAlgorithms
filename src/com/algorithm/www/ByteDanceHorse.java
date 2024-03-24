package com.algorithm.www;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName ByteDanceHorse
 * @Author：Mayuan
 * @Date 2020/6/5 8:39
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字节跳动的笔试题，
 * 田忌赛马
 * <p>
 * 4
 * 70 55 50 20
 * 70 65 55 20
 **/

public class ByteDanceHorse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tSpeed = new int[n];
        int[] qSpeed = new int[n];
        for (int i = 0; i < n; i++) {
            tSpeed[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            qSpeed[i] = in.nextInt();
        }

        // 返回整个赢的次数。

        int num = process(tSpeed, qSpeed);
        System.out.println(num);
    }

    public static int process(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        // 20 50 55 70
        // 20 55 65 70
        int i = 0, j = 0, sum = 0;
        int len1 = a.length - 1, len2 = a.length - 1;
        while (i <= len1 && j <= len2) {
            //田忌最慢马比齐王最慢马要快
            i++;
            if (a[i] > b[j]) {
                j++;
                sum++;
            } else
                // 田忌最慢马比齐王最慢马要慢，田最慢对齐最快
                if (a[i] < b[j]) {
                    i++;
                    len2--;
                    sum--;
                } else {
                    // 当前最慢马不是最后一匹马
                    if (i != len1) {

                        // 当前马的脚力大于齐王的马。
                        if (a[len1] > b[len2]) {
                            len1--;
                            len2--;
                            sum++;
                        } else { // 放水，最慢挑最快
                            i++;
                            len2--;
                            sum--;
                        }
                    } else { // 最后一场了，平手
                        i++;
                        j++;
                    }
                }
        }
        return sum;
    }

}
