package com.ACompany.www;

import java.util.Scanner;

/**
 * @ClassName Ease8083
 * @Author：Mayuan
 * @Date 2020/8/8 20:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 网易笔试题目3
 * <p>
 * 1
 * 5
 * 30 60 5 15 30
 * <p>
 * 输入：
 * 1 表示测试用力数目
 * 5 表示总的个数
 * 下面的五个数字。
 * <p>
 * 输出结果：
 * 20
 * <p>
 * 要求给定一个数字内容
 * 扔掉一部分的值，然后平分成两个部分。
 * 这里扔掉 5 + 15 = 20
 **/


public class Ease8083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            T--;
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            //Arrays.sort(a); 这行可以不要，写的时候忘记删去了
            System.out.println(new Solution().value(n, a));
        }
    }
}

class Solution {
    int[] a;
    int n;
    int ans = Integer.MAX_VALUE;

    public int value(int n, int[] a) {
        this.a = a;
        this.n = n;

        // 由于是从0下标来开始的。
        dfs(n - 1, 0, 0, 0);
        return ans;
    }

    void dfs(int index, int p1, int p2, int value) {
        if (index == -1) {
            if (p1 == p2 && ans > value) {
                ans = value;
            }
            return;
        }
        dfs(index - 1, p1 + a[index], p2, value);
        dfs(index - 1, p1, p2 + a[index], value);
        dfs(index - 1, p1, p2, value + a[index]);
    }
}