package com.queue.www;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName PriorityQueue2
 * @Author：Mayuan
 * @Date 2020/5/10 20:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 优先权队列
 **/
public class PriorityQueue2 {
    static Comparator<Integer> cmp = new Comparator<Integer>() {
        public int compare(Integer e1, Integer e2) {
            return e2 - e1;
        }
    };

    public static void main(String[] args) {
        //不用比较器，默认升序排列
        Queue<Integer> q = new PriorityQueue<>();
        q.add(3);
        q.add(2);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        /**
         * 输出结果
         * 2 3 4
         */
        //使用自定义比较器，降序排列

        System.out.println("\n---------------------------------");
        Queue<Integer> qq = new PriorityQueue<>(cmp);
        qq.add(3);
        qq.add(2);
        qq.add(4);
        while (!qq.isEmpty()) {
            System.out.print(qq.poll() + " ");
        }
        /**
         * 输出结果
         * 4 3 2
         */
    }
}
