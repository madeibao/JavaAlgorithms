package com.queue.www;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @ClassName Queue3
 * @Author：Mayuan
 * @Date 2020/4/28 19:01
 * @Description TODO
 * @Version 1.0
 * 用队列来模拟一个栈的形式。
 **/
public class Queue3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        int Q, len, x;
        String str;
        String[] arr;
        Queue<Integer> queue;
        while (T-- > 0) {
            Q = Integer.parseInt(in.nextLine());
            queue = new ArrayDeque<Integer>();
            while (Q-- > 0) {
                str = in.nextLine();
                arr = str.split(" ");
                len = arr.length;
                if (len == 1) {
                    if (arr[0].equals("TOP")) {
                        System.out.println(queue.isEmpty() ? -1 : queue.peek());
                    } else if (arr[0].equals("POP")) {
                        if (queue.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            queue.remove();
                        }
                    } else if (arr[0].equals("SIZE")) {
                        System.out.println(queue.size());
                    } else {
                        queue.clear();
                    }
                } else {
                    queue.add(Integer.parseInt(arr[1]));
                }
            }
        }
    }
}
