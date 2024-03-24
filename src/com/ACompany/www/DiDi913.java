package com.ACompany.www;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @program: Pro1->C
 * @description: 基本测试文件
 * @author: MaYuan
 * @create: 2019-12-24 19:18
 * @version: 1.0
 **/

public class DiDi913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String[] temp = sc.nextLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);
            int k = Integer.parseInt(temp[2]);

            Set<Integer> set2 = new HashSet<>();
            for (int j = 0; j < m; j++) {
                String[] temp2 = sc.nextLine().split(" ");
                int x = Integer.parseInt(temp2[0]);
                int y = Integer.parseInt(temp2[1]);
                int z = Integer.parseInt(temp2[2]);
                if (z <= k) {
                    set2.add(x);
                    set2.add(y);
                }
            }
            if (set2.size() == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}