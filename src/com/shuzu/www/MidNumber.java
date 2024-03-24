package com.shuzu.www;

import java.util.PriorityQueue;

/**
 * @ClassName MidNumber
 * @Author：Mayuan
 * @Date 2021/1/14/0014 19:50
 * @Description TODO
 * @Version 1.0
 *
 * 无序数组的中位数。
 *
 * 采用堆的
 * 最小堆算法。
 * 这里，给大家介绍一个让人眼前一亮的算法，至少，看着很美妙，可以细细品味。算法的核心是使用最小堆（heap），你想到了吗？
 *
 * 首先将数组的前（n+1）／2个元素建立一个最小堆。
 *
 * 然后，对于下一个元素，和堆顶的元素比较，如果小于等于，丢弃之，接着看下一个元素。如果大于，则用该元素取代堆顶，再调整堆，接着看下一个元素。重复这个步骤，直到数组为空。
 *
 * 当数组都遍历完了，那么，堆顶的元素即是中位数。
 *
 * 可以看出，长度为（n＋1）／2的最小堆是解决方案的精华之处。
 *
 *
 **/
public class MidNumber {

    public static double median(int[] array) {
        int heapSize = array.length/2 + 1;
        PriorityQueue<Integer> heap = new PriorityQueue<>(heapSize);
        for(int i=0; i<heapSize; i++){
            heap.add(array[i]);
        }
        for(int i=heapSize; i<array.length; i++) {
            if(heap.peek()<array[i]) {
                heap.poll();
                heap.add(array[i]);
            }
        }

        if(array.length % 2 == 1) {
            return (double)heap.peek();
        }
        else {
            return (double)(heap.poll()+heap.peek())/2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums= {1,3,2,4,5,8,10,8,9,4,7};
        System.out.println(median(nums));

    }
}
