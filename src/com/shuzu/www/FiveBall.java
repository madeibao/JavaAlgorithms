package com.shuzu.www;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName FiveBall
 * @Author：Mayuan
 * @Date 2020/6/19 16:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * 华为收集五福卡的试题。
 * 判断一共有多少个人能够收集齐全五福纪念卡片。
 **/

public class FiveBall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(",");
        int[] counts = new int[]{0, 0, 0, 0, 0};
        for (int i = 0; i < split.length; i++) {
            char[] ticket = split[i].toCharArray();
            for (int j = 0; j < ticket.length; j++) {
                if (ticket[j] == '1') {
                    counts[j]++;
                }
            }
        }
        Arrays.sort(counts);
        System.out.println(counts[0]);
    }
}