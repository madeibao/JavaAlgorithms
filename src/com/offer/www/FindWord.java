package com.offer.www;

/**
 * @ClassName FindWord
 * @Author：Mayuan
 * @Date 2020/9/19 10:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 查找矩阵中的某一个单词内容。
 **/
public class FindWord {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[] flag = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, rows, cols, i, j, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1) {
            return false;
        }
        if (k == str.length - 1) {
            return true;
        }
        flag[index] = 1;
        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }
        flag[index] = 0;
        return false;
    }

    public static void main(String[] args) {

    }
}
