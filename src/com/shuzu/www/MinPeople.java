package com.shuzu.www;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName MinPeople
 * @Author：Mayuan
 * @Date 2020/6/6 14:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 接听电话的最少的人员。
 **/
public class MinPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[n];
        int[] dep = new int[n];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] sa = line.split(",");
            arr[i] = Integer.parseInt(sa[0]);
            dep[i] = Integer.parseInt(sa[1]);
        }

        int result = find(arr, dep, n);
        System.out.println(result);
        scanner.close();
    }

    static int find(int arr[], int dep[], int n) {

        // 首先进行排序。
        Arrays.sort(arr);
        Arrays.sort(dep);

        // 返回需要的客服人员数。
        int result = 0;
        // 不为空，至少需要一个工作人员。
        int need = 1;

        int i = 1;
        int j = 0;

        // arr [0, 0, 10,15,20,20]
        // dep [20,30,30,50,50,65]
        while (i < arr.length && j < dep.length) {
            if (arr[i] < dep[j]) {
                need += 1;
                i++;
                if (need > result) {
                    result = need;
                }
            } else {
                need -= 1;
                j++;
            }
        }
        return result;
    }
}
