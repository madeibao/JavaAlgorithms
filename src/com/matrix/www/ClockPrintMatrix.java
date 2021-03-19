package com.matrix.www;

/**
 * @ClassName ClockPrintMatrix
 * @Author：Mayuan
 * @Date 2020/3/28 16:36
 * @Description TODO
 * @Version 1.0
 * <p>
 * 顺时针的方向来进行打印一个矩阵的内容
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 **/
public class ClockPrintMatrix {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int[] result = new int[matrix.length * matrix[0].length];
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;
        int index = 0;
        while (left <= right && up <= down) {

            // 从左到右面
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[up][i];
            }

            // 从上面到下面
            for (int i = up + 1; i <= down; i++) {
                result[index++] = matrix[i][right];
            }

            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    result[index++] = matrix[down][i];
                }
            }
            if (left != right) {

                // 注意这里的是up值，不能>= up 值。
                for (int i = down - 1; i > up; i--) {
                    result[index++] = matrix[i][left];
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[] temp = spiralOrder(matrix);
        for (int j : temp) {
            System.out.print(j + " ");
        }
    }
}
