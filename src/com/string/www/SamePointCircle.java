package com.string.www;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName SamePointCircle
 * @Author：Mayuan
 * @Date 2020/5/15 21:38
 * @Description TODO
 * @Version 1.0
 * <p>
 * 同心圆的计算
 * <p>
 * 然后求阴影的面积
 * <p>
 * 5
 * 1 2 3 4 5
 * 47.12389
 **/
public class SamePointCircle {

    public static void main(String[] args) {
        //注意两点：1、Math.PI表示圆周率。2、String.format("%.5f",res)表示保留小数位数。3、输入的半径不是有序的需要排序
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();

            // sc.nextLine();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            double res = Math.pow(arr[n - 1], 2);
            boolean flag = true;
            for (int j = n - 2; j >= 0; j--) {
                if (flag) {
                    res -= Math.pow(arr[j], 2);
                    flag = false;
                } else {
                    res += Math.pow(arr[j], 2);
                    flag = true;
                }

            }
            res *= Math.PI;
            System.out.println(String.format("%.5f", res));
        }
    }
}
