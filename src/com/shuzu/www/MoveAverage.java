package com.shuzu.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: JavaWorkSpace2->MoveAverage
 * @description: 移动平均值内容
 * @author: MaYuan
 * @create: 2020-02-12 15:05
 * @version: 1.0
 * <p>
 * 滑动数组的最大值内容。
 * <p>
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 **/
class MovingAverage {
    private Queue<Integer> queue;
    private int maxSize;
    private float sum;

    //Initialize your data structure here.
    MovingAverage(int Size) {
        queue = new LinkedList<Integer>();
        maxSize = Size;
    }

    double next(int value) {
        sum = 0;
        if (queue.size() >= maxSize) {
            queue.poll();
            queue.offer(value);
        } else {
            queue.offer(value);
        }
        for (Integer x : queue) {
            sum += x;
        }
        return (sum * 1.0) / queue.size();
    }
}

public class MoveAverage {

    public static void main(String[] args) {
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1));
        System.out.println(m.next(10));
        System.out.println(m.next(3));
        System.out.println(m.next(5));
    }
}





