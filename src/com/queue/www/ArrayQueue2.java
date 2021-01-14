package com.queue.www;

/**
 * @ClassName ArrayQueue2
 * @Author：Mayuan
 * @Date 2020/9/16 19:10
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 用数组来模型一个队列的结构。
 **/
public class ArrayQueue2 {

    // 用这个数组来模型队列。
    int[] arr;
    // 队列的大小。
    int size;

    // 此时的数组为空的，指向数组中的最后的一个元素的下标值。
    int rear;

    public ArrayQueue2(int newSize) {
        if (newSize < 0) {
            System.out.println("队列的大小不能为0");
        } else {
            this.size = newSize;
            arr = new int[newSize];
            rear = -1;
        }
    }

    public static void main(String[] args) {


    }
}
