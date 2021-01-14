package com.algorithm.www;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName XieCheng
 * @Author：Mayuan
 * @Date 2020/6/6 10:30
 * @Description TODO
 * @Version 1.0
 **/
public class XieCheng {
    public static void main(String[] args) {

        // 总共需要的客服的总人数。
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            String[] split = string.split(",");
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(split[0]);
            arr[1] = Integer.parseInt(split[1]);
            for (int j = arr[0]; j < arr[1]; j++) {
                if (map.get(j) == null) {
                    map.put(j, 1);
                } else {
                    map.put(j, map.get(j) + 1);
                }
                count = map.get(j) > count ? map.get(j) : count;
            }
        }
        System.out.println(count);
    }
}
