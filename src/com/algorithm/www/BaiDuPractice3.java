package com.algorithm.www;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @ClassName BaiDuPractice3
 * @Author：Mayuan
 * @Date 2020/5/29 21:29
 * @Description TODO
 * @Version 1.0
 * <p>
 * 百度实习笔试题2
 * 有趣的排序。
 * 4
 * 19 7 8 25
 **/

public class BaiDuPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] arrS = s2.split(" ");
            int[] arr = new int[arrS.length];
            int[] result = new int[arr.length];
            for (int i = 0; i < arrS.length; i++) {
                arr[i] = Integer.parseInt(arrS[i]);
                result[i] = arr[i];
            }
            Arrays.sort(result);

            System.out.println("-------");
            for (int j : result) {
                System.out.print(j + " ");
            }
            int count = 0;
            for (int i = 0; i < result.length; i++) {
                if (arr[i] == result[count]) {
                    count += 1;
                }
            }
            System.out.println(result.length - count);
        }
    }
}

