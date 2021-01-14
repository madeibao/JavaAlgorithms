package com.ACompany.www;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @ClassName Ease8082
 * @Author：Mayuan
 * @Date 2020/8/8 19:36
 * @Description TODO
 * @Version 1.0
 * 2020.0808 网易笔试题目：
 * 字典序列的全排列的结果
 * 给定 n，再给了一个排列 T，扩充成排列 S（数字 1 - n 各使用一次）。问最小字典序的S
 * 输入：
 * 5 3
 * 2 1 5
 * <p>
 * 第一个数字代表的是一共有n个数
 * 第二个数字代表的是输入的n个数字
 * 然后输出一个排列，并且是字典的顺序最小
 * <p>
 * 输出:
 * 2 1 3 4 5
 * <p>
 * # 实例2：
 * <p>
 * 输入的值：
 * 5 2
 * 4 2
 * 输出结果：
 * <p>
 * 1 3 4 2 5
 **/
public class Ease8082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] vis = new boolean[n + 1];

        // 首先来创建一个队列的值。
        Queue<Integer> q = new LinkedList();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            vis[num] = true;
            q.offer(num);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= n; i++) {

            // 如果对应的位置是真，跳过。
            if (vis[i]) {
                continue;
            }
            while (!q.isEmpty() && q.peek() < i) {
                ans.append(q.poll() + " ");
            }

            // 默认的条件下的值。
            ans.append(i + " ");
        }
        while (!q.isEmpty()) {
            ans.append(q.poll() + " ");
        }
        System.out.println(ans);
        // 把最后的一个空格来去掉。
        System.out.print(ans.toString().substring(0, ans.length() - 1));
    }
}

