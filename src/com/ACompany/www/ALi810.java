package com.ACompany.www;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName ALi810
 * @Author：Mayuan
 * @Date 2020/8/15 21:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * 4
 * 1 2 14 16
 * 4可数，求一个路灯，使得到各个树的距离最小。
 **/
public class ALi810 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();

            // 各个树所对应的位置值。
            long trees[] = new long[(int) N];
            for (int i = 0; i < N; i++) {
                trees[i] = in.nextLong();
            }
            Arrays.sort(trees);
            int midindex = (N - 1) / 2;
            long toa = trees[midindex];

            long ans = 0L;
            for (int i = 0; i <= midindex; i++) {
                ans += toa - trees[i];
            }
            for (int i = midindex; i < N; i++) {
                ans += trees[i] - toa;
            }
            System.out.println(ans);
        }
    }
}
