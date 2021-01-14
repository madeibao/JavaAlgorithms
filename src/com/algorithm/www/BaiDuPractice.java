package com.algorithm.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName BaiDuPractice
 * @Author：Mayuan
 * @Date 2020/5/29 20:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * 度度熊回家。
 **/
public class BaiDuPractice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            List<Integer> list = new ArrayList();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                list.add(Integer.parseInt(arr[i]));
            }

            for (int i = 1; i < list.size() - 1; i++) {
                int temp = list.remove(i);
                int result = fun(list);
                min = min > result ? result : min;
                list.add(i, temp);
            }
            System.out.println(min);
        }
    }

    public static int fun(List<Integer> list) {
        int distance = 0;
        for (int i = 1; i < list.size(); i++) {
            distance += Math.abs(list.get(i) - list.get(i - 1));
        }
        return distance;
    }
}
