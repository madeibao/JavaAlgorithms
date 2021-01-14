package com.shuzu.www;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName SingleHigh
 * @Author：Mayuan
 * @Date 2020/5/12 14:33
 * @Description TODO
 * @Version 1.0
 * <p>
 * 单科目成绩最高的结果值。
 * <p>
 * *
 * * 输入
 * * 输入第一行包含两个正整数n和m，分别代表学生人数和考试科目数量。(n,m<=500)
 * *
 * * 接下来有n行，每行有m个正整数，每个正整数在1-100之间，中间用空格隔开，表示每个学生的m科考试成绩。
 * *
 * * 输出
 * * 输出仅包含一个整数，表示获得单科成绩优秀奖的人数
 * *
 * *
 * * 样例输入
 * 5 5
 * 28 35 38 10 19
 * 4 76 72 38 86
 * 96 80 81 17 10
 * 70 64 86 85 10
 * 1 93 19 34 41
 * * 样例输出
 * * 4
 **/
public class SingleHigh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        if (n < 2) {
            System.out.println(m);
        } else {
            arr = new int[n][m];
        }

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int j = 0; j < m; j++) {
            int k = 0;
            int[] index = new int[n];
            int max = arr[0][j];
            for (int i = 0; i < n; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            for (int i = 0; i < n; i++) {

                if (arr[i][j] == max) {
                    index[k++] = i;
                }
            }

            for (int b = 0; b < k; b++) {
                set.add(index[b]);
            }
        }


        System.out.println(set.size());
    }
}
