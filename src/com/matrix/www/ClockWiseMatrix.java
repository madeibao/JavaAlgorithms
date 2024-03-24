package com.matrix.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ClockWiseMatrix
 * @Author：Mayuan
 * @Date 2020/5/17 20:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 矩阵的顺时针取出其中的元素。
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 示例 2:
 * <p>
 * 输入:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/spiral-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class ClockWiseMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;

        while (left <= right && up <= down) {

            // 从左到右面
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }

            // 从上面到下面
            for (int i = up + 1; i <= down; i++) {
                res.add(matrix[i][right]);
            }

            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[down][i]);
                }
            }
            if (left != right) {

                // 注意这里的是up值，不能>= up 值。
                for (int i = down - 1; i > up; i--) {
                    res.add(matrix[i][left]);
                }
            }

            // 从左到右面加。
            left++;
            right--;
            // 从上到下面加。
            up++;
            down--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> res = spiralOrder(matrix);
        System.out.println(res);
    }
}
