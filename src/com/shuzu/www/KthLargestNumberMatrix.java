package com.shuzu.www;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @ClassName KthLargestNumberMatrix
 * @Author：Mayuan
 * @Date 2020/7/21 22:37
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个矩阵中的第k小的元素。
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * matrix = [
 * [ 1,  5,  9],
 * [10, 11, 13],
 * [12, 13, 15]
 * ],
 * k = 8,
 * <p>
 * 返回 13。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class KthLargestNumberMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> res = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res.add(matrix[i][j]);
                if (res.size() > k) {
                    res.poll();
                }
            }
        }
        return res.peek();
    }

    public static void main(String[] args) {

        int[][] res = new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println(kthSmallest(res, 8));
    }
}
