package com.KthTop.www;

import java.util.PriorityQueue;

/**
 * @ClassName XthYthPoint
 * @Author：Mayuan
 * @Date 2024/3/17/0017 21:29
 * @Description TODO
 * @Version 1.0
 *
 * https://leetcode.cn/problems/k-closest-points-to-origin/description/
 *
 * 最接近原点的 K 个点
 **/
public class XthYthPoint {
    public static int[][] kClosest(int[][] points, int K) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> (cal(b) - cal(a)));
        int[][] res = new int[K][2];
        for(int i=0;i<K;i++) {
            maxHeap.offer(points[i]);
        }

        for(int i = K; i < points.length; i++){
            if(cal(maxHeap.peek()) > cal(points[i])){
                maxHeap.poll();
                maxHeap.offer(points[i]);
            }
        }

        for(int i=0;i<K;i++) {
            res[i] = maxHeap.poll();
        }
        return res;
    }

    public static int cal(int[] a){
        return (a[0] * a[0]) + (a[1] * a[1]);
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int K = 1;
        int[][] res = kClosest(points,K);
        for(var j:res) {
            for(int i: j) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
