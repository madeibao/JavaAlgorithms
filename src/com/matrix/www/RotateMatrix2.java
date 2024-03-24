package com.matrix.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RotateMatrix2
 * @Author：Mayuan
 * @Date 2020/6/18 10:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 矩阵的旋转。
 **/
public class RotateMatrix2 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;
        while (left <= right && up <= down) {

            // 从左到右面
            // 从左到右的过程中，横坐标不变，纵坐标在变化。
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
            left++;
            right--;
            up++;
            down--;
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},};

        List<Integer> res = spiralOrder(nums);
        res.forEach(System.out::println);
    }
}
